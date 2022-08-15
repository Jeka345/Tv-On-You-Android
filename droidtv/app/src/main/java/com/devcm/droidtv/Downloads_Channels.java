package com.devcm.droidtv;

import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public class Downloads_Channels extends AsyncTask<String, Void, String>
{
    public List<XMLUtils.EntryMovie> entries = null;
    public boolean mstat = false;
    public String doInBackground(String... urls)
    {
        try
        {
            String dd = loadXmlFromNetwork(urls[0]);
            this.mstat = true;
            return dd;
        }
        catch (IOException e)
        {
            this.mstat = true;
            return "Ошибка соединения, повторите попытку позже.";
        }
        catch (XmlPullParserException e2)
        {
            this.mstat = true;
            return "Ошибка чтения XML файла, свяжитесь с автором приложения!";
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(String result) {
        PrintStream printStream = System.out;
        printStream.println("RESULT " + result);
        this.mstat = true;
    }

    private String loadXmlFromNetwork(String urlString) throws XmlPullParserException, IOException {
        InputStream stream = null;
        new XMLUtils();
        try
        {
            stream = downloadUrl(urlString);
            this.entries = XMLUtils.parseMovies(stream);
            System.out.println(this.entries.get(0).title);
        }
        finally
        {
            if (stream != null)
            {
                stream.close();
            }
        }
        return urlString;
    }

    private InputStream downloadUrl(String urlString) throws IOException
    {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("x-smartlabs-mac-address", "00:00:00:00:00:00");
        conn.setDoInput(true);
        conn.connect();
        return conn.getInputStream();
    }
}
