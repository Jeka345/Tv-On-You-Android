package com.devcm.droidtv;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class XMLUtils
{
    public static final String ns = null;
    public static List parseCats(InputStream in) throws XmlPullParserException, IOException
    {
        System.out.println("Parse Cats start");
        try
        {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            parser.setInput(in, null);
            parser.nextTag();
            return readRows(parser);
        }
        finally
        {
            in.close();
        }
    }

    private static List readRows(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        List entries = new ArrayList();
        parser.require(2, ns, "rows");
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                if (parser.getName().equals("row"))
                {
                    entries.add(readGenre(parser));
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return entries;
    }

    private static Entry readGenre(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        parser.require(2, ns, "row");
        String title = null;
        String summary = null;
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                String name = parser.getName();
                if (name.equals("Name_Category"))
                {
                    title = readGP(parser, "Name_Category");
                }
                else if (name.equals("ID_Category"))
                {
                    summary = readGP(parser, "ID_Category");
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return new Entry(title, summary, null);
    }

    public static List parseMovies(InputStream in) throws XmlPullParserException, IOException
    {
        try
        {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            parser.setInput(in, null);
            parser.nextTag();
            return readMovieList(parser);
        }
        finally
        {
            in.close();
        }
    }

    private static List readMovieList(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        List entries = new ArrayList();
        parser.require(2, ns, "channels_list");
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                if (parser.getName().equals("channels"))
                {
                    entries = readFilms(parser);
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return entries;
    }

    private static List readFilms(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        List entries = new ArrayList();
        parser.require(2, ns, "channels");
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                if (parser.getName().equals("channel"))
                {
                    entries.add(readEntry(parser));
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return entries;
    }

    public static class Entry
    {
        public final String link;
        public final String summary;
        public final String title;

        private Entry(String title2, String summary2, String link2)
        {
            this.title = title2;
            this.summary = summary2;
            this.link = link2;
        }
    }

    public static class EntryMovie implements Serializable
    {
        static final long serialVersionUID = 777566175075960653L;
        public final String genre;
        private long id;
        public final String link;
        public final String summary;
        public final String title;

        public String toString()
        {
            return "EntryMovie{id=" + this.id + ", title='" + this.title + '\'' + ", videoUrl='" + this.link + '\'' + ", backgroundImageUrl='" + this.summary + '\'' + ", cardImageUrl='" + this.summary + '\'' + '}';
        }

        private EntryMovie(String title2, String summary2, String link2, String genre2) {
            this.title = title2;
            this.summary = summary2;
            this.link = link2;
            this.genre = genre2;
        }

        public Object getCardImageUrl() {
            return "" + this.summary;
        }

        public String getStudio() {
            return "";
        }

        public String getTitle() {
            return this.title;
        }

        public String getDescription() {
            return "";
        }

        public String getVideoUrl() {
            return this.link;
        }

        public String getBackgroundImageUrl() {
            return "" + this.summary;
        }

        public void setId(long id)
        {
            this.id = id;
        }
    }

    private static EntryMovie readEntry(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(2, ns, "channel");
        String title = null;
        String summary = null;
        String link = null;
        String genre = null;
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                String name = parser.getName();
                if (name.equals("title"))
                {
                    title = readTitle(parser);
                }
                else if (name.equals("logo"))
                {
                    summary = readLogo(parser);
                }
                else if (name.equals("id"))
                {
                    Long.valueOf(Long.parseLong(readId(parser)));
                }
                else if (name.equals("variables"))
                {
                    link = readAssets(parser);
                }
                else if (name.equals("categories"))
                {
                    genre = readGenres(parser);
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return new EntryMovie(title, summary, link, genre);
    }

    private static String readAssets(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        parser.require(2, ns, "variables");
        String title = "";
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                if (parser.getName().equals("link_channel"))
                {
                    title = readIfn(parser);
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return title;
    }

    private static String readGenres(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        parser.require(2, ns, "categories");
        String title = "";
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                if (parser.getName().equals("id"))
                {
                    title = readId(parser);
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return title;
    }

    private static String readIfn(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        parser.require(2, ns, "link_channel");
        String title = "";
        while (parser.next() != 3)
        {
            if (parser.getEventType() == 2)
            {
                if (parser.getName().equals("url_live"))
                {
                    title = readIF(parser);
                }
                else
                {
                    skip(parser);
                }
            }
        }
        return title;
    }

    private static String readId(XmlPullParser parser) throws IOException, XmlPullParserException
    {
        String str = ns;
        parser.require(2, str, "id");
        String title = readText(parser);
        parser.require(3, str, "id");
        return title;
    }

    private static String readIF(XmlPullParser parser) throws IOException, XmlPullParserException
    {
        String str = ns;
        parser.require(2, str, "url_live");
        String title = readText(parser);
        parser.require(3, str, "url_live");
        return title;
    }

    private static String readTitle(XmlPullParser parser) throws IOException, XmlPullParserException {
        String str = ns;
        parser.require(2, str, "title");
        String title = readText(parser);
        parser.require(3, str, "title");
        return title;
    }

    private static String readLogo(XmlPullParser parser) throws IOException, XmlPullParserException {
        String str = ns;
        parser.require(2, str, "logo");
        String title = readText(parser);
        parser.require(3, str, "logo");
        return title;
    }

    private static String readGP(XmlPullParser parser, String tagname) throws IOException, XmlPullParserException {
        String str = ns;
        parser.require(2, str, tagname);
        String title = readText(parser);
        parser.require(3, str, tagname);
        return title;
    }

    private static String readText(XmlPullParser parser) throws IOException, XmlPullParserException
    {
        if (parser.next() != 4)
        {
            return "";
        }
        String result = parser.getText();
        parser.nextTag();
        return result;
    }

    private static void skip(XmlPullParser parser) throws XmlPullParserException, IOException
    {
        if (parser.getEventType() == 2)
        {
            int depth = 1;
            while (depth != 0) {
                switch (parser.next())
                {
                    case 2:
                        depth++;
                        break;
                    case 3:
                        depth--;
                        break;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }
}
