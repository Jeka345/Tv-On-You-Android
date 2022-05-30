package com.devcm.tvyoutv;
import java.util.ArrayList;
import java.util.List;
public final class ChannelList
{
    public static final String FEDERALS[];
    static
    {
        FEDERALS = new String[]
                {
                        "Федеральные"
                };
    }
    public static final String RAZVLEKATILNIE[];
    static
    {
        RAZVLEKATILNIE = new String[]
                {
                        "💥Развлекательные💥"
                };
    }
    public static final String INFORMATIONS[];
    static
    {
        INFORMATIONS = new String[]
                {
                        "💬Информационные💬"
                };
    }
    public static final String KIDSMENU[];
    static
    {
        KIDSMENU = new String[]
                {
                        "👩‍🚀Детские👩‍🚀‍"
                };
    }
    public static final String ANIMALMENU[];
    static
    {
        ANIMALMENU = new String[]
                {
                        "🌏Познавательные🌧"
                };
    }
    public static final String ANIMALUHD[];
    static
    {
        ANIMALUHD = new String[]
                {
                        "Познавательные UHD"
                };
    }
    public static final String FILMSCATEGORY[];
    static
    {
        FILMSCATEGORY = new String[]
                {
                        "🎬Фильмовые📽"
                };
    }
    public static final String MUSICCATEGORY[];
    static
    {
        MUSICCATEGORY = new String[]
                {
                        "🎧Музыкальные🎧"
                };
    }
    public static final String REGIONALS[];
    static
    {
        REGIONALS = new String[]
                {
                        "🗿Региональные🎭"
                };
    }
    public static final String SPORTCHANNELS[];
    static
    {
        SPORTCHANNELS = new String[]
                {
                        "🏑Спортивные🏈"
                };
    }
    public static final String RADIOCHANNELS[];
    static
    {
        RADIOCHANNELS = new String[]
                {
                        "📻Радио🎧"
                };
    }
    private static List<Movie> federals;
    private static List<Movie> razvlekat;
    private static List<Movie> informations;
    private static List<Movie> kidstv;
    private static List<Movie> animaltv;
    private static List<Movie> animaltvuhd;
    private static List<Movie> filmstv;
    private static List<Movie> musictv;
    private static List<Movie> regionaltv;
    private static List<Movie> sporttv;
    private static List<Movie> radio;
    private static long count = 0;
    public static final String urlimage = "https://itv.svc.iptv.rt.ru";
    public static final String imgur = "https://i.imgur.com/";
    public static final String cdnimage = "http://cdnfilesproject.sytes.net/iptvdevcm/";
    public static final String urllive1server = "https://livetv.mylifeisgood.ml/channels/";
    public static final String yandexefir = "https://strm.yandex.ru/kal/";
    public static List<Movie> getList()
    {
        if (federals == null)
        {
            federals = FEDERALSCHANNELS();
        }
        return federals;
    }
    public static List<Movie> getrazvlekat()
    {
        if (razvlekat == null)
        {
            razvlekat = RAZVLEKATILNIE();
        }
        return razvlekat;
    }
    public static List<Movie> getInformations()
    {
        if (informations == null)
        {
            informations = GETINFORMATIONSCHANNELS();
        }
        return informations;
    }
    public static List<Movie> getKidsTv()
    {
        if (kidstv == null)
        {
            kidstv = KidsTV();
        }
        return kidstv;
    }
    public static List<Movie> getAnimaltv()
    {
        if (animaltv == null)
        {
            animaltv = AnimalTV();
        }
        return animaltv;
    }
    public static List<Movie> getAnimalUHDtv()
    {
        if (animaltvuhd == null)
        {
            animaltvuhd = AnimalUHDTV();
        }
        return animaltvuhd;
    }
    public static List<Movie> getFilmsTV()
    {
        if (filmstv == null)
        {
            filmstv = FilmTV();
        }
        return filmstv;
    }
    public static List<Movie> getMusicTV()
    {
        if (musictv == null)
        {
            musictv = MusicTV();
        }
        return musictv;
    }
    public static List<Movie> getRegionaltv()
    {
        if (regionaltv == null)
        {
            regionaltv = RegionalsTV();
        }
        return regionaltv;
    }
    public static List<Movie> getSporttv()
    {
        if (sporttv == null)
        {
            sporttv = SportsTV();
        }
        return sporttv;
    }
    public static List<Movie> getRadio()
    {
        if (radio == null)
        {
            radio = RadioTV();
        }
        return radio;
    }

    public static List<Movie> FEDERALSCHANNELS()
    {
        federals = new ArrayList<>();
        String titlechannels[] = {
                "Первый канал",
                "Россия 1",
                "Матч! ТВ",
                "НТВ HD",
                "Пятый канал",
                "Россия Культура",
                "Россия 24",
                "Карусель",
                "Общественное телевидение России",
                "ТВ Центр",
                "РЕН ТВ HD",
                "СПАС",
                "СТС HD",
                "Домашний HD",
                "ТВ3 HD",
                "Пятница! HD",
                "Звезда",
                "МИР HD",
                "ТНТ HD",
                "МУЗ-ТВ"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "perviytest.m3u8",
                urllive1server + "russia1.m3u8",
                urllive1server + "matchhd_nocensored.m3u8",
                urllive1server + "ntv.m3u8",
                urllive1server + "5tv.m3u8",
                urllive1server + "russiak.m3u8",
                urllive1server + "russia24.m3u8",
                urllive1server + "karusel.m3u8",
                yandexefir + "otr/otr0.m3u8",
                yandexefir + "tvc/tvc0.m3u8",
                urllive1server + "rentvhd.m3u8",
                urllive1server + "spas.m3u8",
                urllive1server + "sts.m3u8",
                urllive1server + "domashnii.m3u8",
                urllive1server + "tv3.m3u8",
                urllive1server + "friday.m3u8",
                urllive1server + "zvezda.m3u8",
                yandexefir + "mir/mir0.m3u8",
                urllive1server + "tnt.m3u8",
                urllive1server + "muztv.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1529398530175.png",
                urlimage + "/sdp/mos/nclogo1497612738365.png",
                urlimage + "/sdp/mos/nclogo1572956617832.png",
                urlimage + "/sdp/mos/nclogo1516193016598.png",
                urlimage + "/sdp/ct/nclogo1536600415211.png",
                urlimage + "/sdp/ct/nclogo1497430120145.png",
                urlimage + "/sdp/mos/nclogo1497528181419.png",
                urlimage + "/sdp/mos/nclogo1602681864854.png",
                urlimage + "/sdp/mos/nclogo1536676739922.png",
                urlimage + "/sdp/ct/nclogo1536609967851.png",
                urlimage + "/sdp/ct/nclogo1532358088298.png",
                urlimage + "/sdp/mos/nclogo1569483524977.png",
                urlimage + "/sdp/ct/nclogo1533311356055.png",
                urlimage + "/sdp/ct/nclogo1519580577683.png",
                urlimage + "/sdp/mos/nclogo1507133404466.png",
                urlimage + "/sdp/mos/nclogo1522312220352.png",
                urlimage + "/sdp/mos/nclogo1536610730242.png",
                urlimage + "/sdp/mos/nclogo1508243678871.png",
                urlimage + "/sdp/mos/nclogo1508420635111.png",
                urlimage + "/sdp/mos/nclogo1635847725334.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            federals.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return federals;
    }

    public static List<Movie> RAZVLEKATILNIE()
    {
        razvlekat = new ArrayList<>();
        String titlechannels[] = {
                "СТС Love",
                "Суббота",
                "2x2 ТВ",
                "ТНТ4 HD",
                "Paramount Comedy",
                "Paramount Channel",
                "Телеканал 360°",
                "Анекдот ТВ",
                "Канал Ю"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "stslove.m3u8",
                urllive1server + "subbota.m3u8",
                urllive1server + "2x2.m3u8",
                urllive1server + "tnt4hd.m3u8",
                urllive1server + "paramount_comedy.m3u8",
                urllive1server + "paramount_channel.m3u8",
                urllive1server + "ch360.m3u8",
                urllive1server + "anekdot.m3u8",
                urllive1server + "u_ott_tv.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1560865516031.png",
                urlimage + "/sdp/mos/nclogo1612112008234.png",
                urlimage + "/sdp/mos/nclogo1629960527155.png",
                urlimage + "/sdp/mos/nclogo1534762634936.png",
                urlimage + "/sdp/mos/nclogo1497612781530.png",
                urlimage + "/sdp/mos/nclogo1508246021246.png",
                urlimage + "/sdp/mos/nclogo1524557207303.png",
                urlimage + "/sdp/mos/nclogo1497600539849.png",
                urlimage + "/sdp/ct/nclogo1536331049265.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            razvlekat.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return razvlekat;
    }

    public static List<Movie> GETINFORMATIONSCHANNELS()
    {
        informations = new ArrayList<>();
        String titlechannels[] = {
                "Мир 24 HD",
                "360° Новости"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                yandexefir + "mir24/mir240.m3u8",
                urllive1server + "ch360news.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1536614122484.png",
                urlimage + "/sdp/mos/nclogo1533293011586.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            informations.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return informations;
    }

    public static List<Movie> KidsTV()
    {
        kidstv = new ArrayList<>();
        String titlechannels[] = {
                "Disney",
                "Nickelodeon HD",
                "Смайлик",
                "СТС Kids HD",
                "Gulli Girl",
                "Tiji",
                "Рыжий"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "disneysd.m3u8",
                urllive1server + "nickelodeon-hd.m3u8",
                urllive1server + "smile.m3u8",
                urllive1server + "ctckids.m3u8",
                urllive1server + "gulli.m3u8",
                urllive1server + "tiji.m3u8",
                urllive1server + "ryjii.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/ct/nclogo1544172455207.png",
                urlimage + "/sdp/mos/nclogo1497612622596.png",
                urlimage + "/sdp/mos/broadcastChannel1594367487573.png",
                urlimage + "/sdp/mos/nclogo1534923709826.png",
                urlimage + "/sdp/mos/nclogo1536766285308.png",
                urlimage + "/sdp/mos/nclogo1606126555684.png",
                imgur + "9kQDKj0.jpg"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            kidstv.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return kidstv;
    }

    public static List<Movie> AnimalTV()
    {
        animaltv = new ArrayList<>();
        String titlechannels[] = {
                "DTX HD",
                "Discovery Science HD",
                "Моя Планета",
                "Приключения",
                "Первый космический HD",
                "Viasat History HD",
                "Viasat Explore HD",
                "Viasat Nature HD",
                "Viasat Nature/History HD",
                "National Geographic HD",
                "Discovery CEE HD",
                "Investigation Discovery HD",
                "Top Secret",
                "Диалоги о Рыбалке",
                "Оружие",
                "Загородный Int",
                "HD Life",
                "Живи активно HD",
                "Глазами туриста",
                "Живая природа"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "discoverydtx.m3u8",
                urllive1server + "discoveryscience.m3u8",
                urllive1server + "myplanet.m3u8",
                urllive1server + "adventureshd.m3u8",
                urllive1server + "firstspace.m3u8",
                urllive1server + "viasat_history.m3u8",
                urllive1server + "viasat_explore.m3u8",
                urllive1server + "viasat_nature.m3u8",
                urllive1server + "viasatnaturehistory.m3u8",
                urllive1server + "national_geographic.m3u8",
                urllive1server + "discovery.m3u8",
                urllive1server + "discoveryxtra.m3u8",
                urllive1server + "sovsec127.m3u8",
                urllive1server + "dialogiorybalke.m3u8",
                urllive1server + "oruzhie.m3u8",
                urllive1server + "zagorodint.m3u8",
                urllive1server + "hdlife.m3u8",
                urllive1server + "jiviactivno.m3u8",
                urllive1server + "glazamiturista.m3u8",
                urllive1server + "jivyapriroda.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1516106158586.png",
                urlimage + "/sdp/mos/nclogo1536686299279.png",
                urlimage + "/sdp/mos/nclogo1508246944970.png",
                imgur + "2htbIea.png",
                imgur + "Ke0Cwtw.jpg",
                urlimage + "/sdp/mos/nclogo1593514427579.png",
                urlimage + "/sdp/mos/nclogo1593515024787.png",
                urlimage + "/sdp/mos/nclogo1593514405658.png",
                urlimage + "/sdp/mos/nclogo1593514310571.png",
                urlimage + "/sdp/mos/nclogo1504685847641.png",
                urlimage + "/sdp/mos/nclogo1567606530589.png",
                urlimage + "/sdp/mos/nclogo1602255131051.png",
                urlimage + "/sdp/mos/nclogo1616576008691.png",
                urlimage + "/sdp/mos/nclogo1544005813039.png",
                urlimage + "/sdp/mos/nclogo1547125351834.png",
                cdnimage + "zagorodint.jpeg",
                cdnimage + "hd-life.png",
                urlimage + "/sdp/mos/nclogo1626944669217.png",
                urlimage + "/sdp/mos/nclogo1574337364513.png",
                urlimage + "/sdp/mos/nclogo1574337312666.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            animaltv.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return animaltv;
    }

    public static List<Movie> AnimalUHDTV()
    {
        animaltvuhd = new ArrayList<>();
        String titlechannels[] = {
                "Наша Сибирь 4К [HEVEC]"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "nashasibir4k.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1601882614829.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            animaltvuhd.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return animaltvuhd;
    }

    public static List<Movie> FilmTV()
    {
        filmstv = new ArrayList<>();
        String titlechannels[] = {
                "Кино ТВ",
                "Fox HD",
                "Fox Life HD",
                "VIP Megahit HD",
                "VIP Comedy HD",
                "VIP Premiere HD",
                "VIP Serial HD",
                "TV1000 HD",
                "TV1000 Action HD",
                "TV1000 Русское кино HD",
                "Феникс+Кино",
                "НТВ Хит",
                "НТВ Сериал",
                "НТВ Право",
                "НТВ Стиль",
                "Trash",
                "START AIR HD",
                "START WORLD HD"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "kinotvst.m3u8",
                urllive1server + "fox.m3u8",
                urllive1server + "foxlife.m3u8",
                urllive1server + "vip_megahit.m3u8",
                urllive1server + "vip_comedy.m3u8",
                urllive1server + "vip_premiere.m3u8",
                urllive1server + "vip_serial.m3u8",
                urllive1server + "tv1000.m3u8",
                urllive1server + "tv1000action.m3u8",
                urllive1server + "tv1000ruskino.m3u8",
                urllive1server + "fenixkino.m3u8",
                urllive1server + "ntvhit24.m3u8",
                urllive1server + "ntvserial24.m3u8",
                urllive1server + "ntvpravo24.m3u8",
                urllive1server + "ntvstyle24.m3u8",
                urllive1server + "trash.m3u8",
                urllive1server + "96d9a62bc619079db307c8fd067a1ab9.m3u8",
                urllive1server + "ccf149ef976cb08ffb31e2047772386a.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1509023376742.png",
                urlimage + "/sdp/mos/nclogo1536308528386.png",
                urlimage + "/sdp/mos/nclogo1508933868682.png",
                urlimage + "/sdp/mos/nclogo1593514267143.png",
                urlimage + "/sdp/mos/nclogo1593514287074.png",
                urlimage + "/sdp/mos/nclogo1593514245957.png",
                urlimage + "/sdp/mos/nclogo1593514331524.png",
                urlimage + "/sdp/mos/nclogo1593514194654.png",
                urlimage + "/sdp/mos/nclogo1593514116881.png",
                urlimage + "/sdp/mos/nclogo1593514220982.png",
                urlimage + "/sdp/mos/nclogo1546048595577.png",
                urlimage + "/sdp/mos/nclogo1565015693388.png",
                imgur + "o0qBKsu.png",
                imgur + "aBN9Ks4.png",
                imgur + "rY2GjoJ.png",
                urlimage + "/sdp/mos/nclogo1600068995266.png",
                urlimage + "/sdp/mos/nclogo1640602798756.png",
                urlimage + "/sdp/mos/nclogo1642407269046.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            filmstv.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return filmstv;
    }

    public static List<Movie> MusicTV()
    {
        musictv = new ArrayList<>();
        String titlechannels[] = {
                "Russian Music Box",
                "Music Box Gold",
                "ТНТ Music",
                "Europa Plus HD",
                "1HD Music Television",
                "Bridge",
                "Bridge Classic",
                "Bridge Deluxe",
                "Bridge Hits",
                "Bridge Русский хит",
                "Bridge Шлягер",
                "Bridge Фрэш"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                yandexefir + "rmbox/rmbox0.m3u8",
                urllive1server + "rusmusicbox24.m3u8",
                yandexefir + "tntmusic/tntmusic0.m3u8",
                yandexefir + "europaplus/europaplus0.m3u8",
                urllive1server + "1hdmusic.m3u8",
                urllive1server + "bridgetv24h.m3u8",
                urllive1server + "bridgeclassictv.m3u8",
                urllive1server + "bridgedeluxetv.m3u8",
                urllive1server + "bridgehitstv.m3u8",
                urllive1server + "bridgerushittv.m3u8",
                urllive1server + "bridgetvshlyager.m3u8",
                yandexefir + "bridge_tv_fresh/bridge_tv_fresh0.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1598949465804.png",
                urlimage + "/sdp/mos/nclogo1598949637593.png",
                urlimage + "/sdp/mos/nclogo1531394833182.png",
                urlimage + "/sdp/mos/nclogo1497600683226.png",
                urlimage + "/sdp/mos/nclogo1540376320156.png",
                urlimage + "/sdp/mos/nclogo1638793935097.png",
                urlimage + "/sdp/mos/nclogo1638793968662.png",
                urlimage + "/sdp/mos/nclogo1638793980605.png",
                urlimage + "/sdp/mos/nclogo1638793958083.png",
                urlimage + "/sdp/mos/nclogo1638793947266.png",
                urlimage + "/sdp/mos/nclogo1602157236453.png",
                imgur + "HRQbgXf.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            musictv.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return musictv;
    }

    public static List<Movie> RegionalsTV()
    {
        regionaltv = new ArrayList<>();
        String titlechannels[] = {
                "Москва 24",
                "Москва. Доверие",
                "78 канал Санкт-Петербург",
                "НТС Севастополь"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "moscow24.m3u8",
                urllive1server + "moscvadoverie.m3u8",
                urllive1server + "78saintpetersburg.m3u8",
                yandexefir + "nts/nts0.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1583844644861.png",
                urlimage + "/sdp/mos/nclogo1515662710213.png",
                imgur + "C05Kgkf.png",
                imgur + "xAwpOWL.png"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            regionaltv.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return regionaltv;
    }
    public static List<Movie> SportsTV()
    {
        sporttv = new ArrayList<>();
        String titlechannels[] = {
                "Матч! Страна",
                "Старт HD",
                "Удар!",
                "Viasat Sport HD",
                "Eurosport 1",
                "Eurosport 2",
                "Setanta 1",
                "Setanta 2",
                "Матч! Планета",
                "Наш спорт 1",
                "Наш спорт 2",
                "Наш спорт 3",
                "Наш спорт 4",
                "Наш спорт 5",
                "Наш спорт 6",
                "Наш спорт 7",
                "Наш спорт 8",
                "Наш спорт 9",
                "Наш спорт 10",
                "Наш спорт 11",
                "Наш спорт 12",
                "Наш спорт 13",
                "Наш спорт 14",
                "Наш спорт 15",
                "Наш спорт 16",
                "Наш спорт 17",
                "Наш спорт 18",
                "Наш спорт 19",
                "Наш спорт 20",
                "Наш спорт 21",
                "Наш спорт 22",
                "Наш спорт 23",
                "Наш спорт 24"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "matchstrana.m3u8",
                urllive1server + "startlive.m3u8",
                yandexefir + "udar/udar0.m3u8",
                urllive1server + "viasatsporthd.m3u8",
                urllive1server + "eurosport1ru.m3u8",
                urllive1server + "eurosport2.m3u8",
                urllive1server + "setantahd.m3u8",
                urllive1server + "setantaplus.m3u8",
                urllive1server + "matchplaneta.m3u8",
                urllive1server + "nashhokkey1.m3u8",
                urllive1server + "nashhokkey2.m3u8",
                urllive1server + "nashhokkey3.m3u8",
                urllive1server + "nashhokkey4.m3u8",
                urllive1server + "nashhokkey5.m3u8",
                urllive1server + "nashhokkey6.m3u8",
                urllive1server + "nashhokkey7.m3u8",
                urllive1server + "nashhokkey8.m3u8",
                urllive1server + "nashhokkey9.m3u8",
                urllive1server + "nashsport10.m3u8",
                urllive1server + "nashsport11.m3u8",
                urllive1server + "nashsport12.m3u8",
                urllive1server + "nashsport13.m3u8",
                urllive1server + "nashsport14.m3u8",
                urllive1server + "nashsport15.m3u8",
                urllive1server + "nashsport16.m3u8",
                urllive1server + "nashsport17.m3u8",
                urllive1server + "nashsport18.m3u8",
                urllive1server + "nashsport19.m3u8",
                urllive1server + "nashsport20.m3u8",
                urllive1server + "nashsport21.m3u8",
                urllive1server + "nashsport22.m3u8",
                urllive1server + "nashsport23.m3u8",
                urllive1server + "nashsport24.m3u8"
        };
        String cardImageUrlchannels[] = {
                urlimage + "/sdp/mos/nclogo1551687506107.png",
                urlimage + "/sdp/mos/nclogo1633086831301.png",
                urlimage + "/sdp/mos/nclogo1640863511502.png",
                urlimage + "/sdp/mos/nclogo1593514353890.png",
                urlimage + "/sdp/mos/nclogo1508251593211.png",
                urlimage + "/sdp/mos/nclogo1579851788766.png",
                imgur + "TTrQ6ru.jpg",
                imgur + "HqVJnKR.jpg",
                imgur + "h0IprYW.jpg",
                imgur + "uUfwtPx.jpg",
                imgur + "kKMv5NY.jpg",
                imgur + "i3QTpMb.jpg",
                imgur + "kur4kFy.jpg",
                imgur + "PIXjfTL.jpg",
                imgur + "lnKn9lQ.jpg",
                imgur + "unBCiMA.jpg",
                imgur + "qbQ3nlF.jpg",
                imgur + "5Jw04iK.jpg",
                imgur + "YgfEMPt.jpg",
                imgur + "h2Ohj2v.jpg",
                imgur + "7ggDUOo.jpg",
                imgur + "W5QRTel.jpg",
                imgur + "tZPACcn.jpg",
                imgur + "SL2aQJn.jpg",
                imgur + "e3Crfib.jpg",
                imgur + "X1CpTe2.jpg",
                imgur + "iVsofK6.jpg",
                imgur + "PzgEgxy.jpg",
                imgur + "f3bVeZB.jpg",
                imgur + "5US6oPq.jpg",
                imgur + "1uvN6IZ.jpg",
                imgur + "D3ZAIEd.jpg",
                imgur + "J80eo6C.jpg"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            sporttv.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return sporttv;
    }
    public static List<Movie> RadioTV()
    {
        radio = new ArrayList<>();
        String titlechannels[] = {
                "Vesti FM",
                "Радио родных дорог",
                "Дорожное радио",
                "Европа плюс",
                "Авторадио",
                "Радио Maximus",
                "Русское радио",
                "Юмор FM",
                "Радио Ваня",
                "Comedy Radio",
                "Радио DFM",
                "Ретро FM",
                "Радио Хит FM",
                "Радио на семи холмах",
                "Радио воскресенье",
                "Радио звезда",
                "Радио комсомольская правда",
                "Energy Fm",
                "Радио Romantica",
                "Радио для двоих",
                "Радио 107 Краснодар",
                "Детское радио",
                "Радио ТВ",
                "Радио Град Петров",
                "Новое радио"
        };

        String description[] = {
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст",
                "Тут когда нибудь появится программа передач, а пока что тут просто этот текст"
        };
        String videoUrlchannels[] = {
                urllive1server + "vestifm.m3u8",
                urllive1server + "radiorodniyxdorog.m3u8",
                urllive1server + "dorojnoeradio.m3u8",
                urllive1server + "europaplusradio.m3u8",
                urllive1server + "avtoradio.m3u8",
                urllive1server + "radiomaximus.m3u8",
                urllive1server + "rusradio.m3u8",
                urllive1server + "yumorfm.m3u8",
                urllive1server + "radiovanya.m3u8",
                urllive1server + "comedyradio.m3u8",
                urllive1server + "radiodfm.m3u8",
                urllive1server + "retrofm.m3u8",
                urllive1server + "radiohitfm.m3u8",
                urllive1server + "radionasemiholmax.m3u8",
                urllive1server + "radiovoskresenie.m3u8",
                urllive1server + "radiozvezda.m3u8",
                urllive1server + "radiokomsomolpravda.m3u8",
                urllive1server + "radioenegry.m3u8",
                urllive1server + "radioromantica.m3u8",
                urllive1server + "radiodlyadvoix.m3u8",
                urllive1server + "radio107krasnodar.m3u8",
                urllive1server + "kidsradio.m3u8",
                urllive1server + "radiotv.m3u8",
                urllive1server + "radiogradpetrov.m3u8",
                urllive1server + "newradio.m3u8"
        };
        String cardImageUrlchannels[] = {
                imgur + "urPlmtd.png",
                imgur + "YlgJdT6.png",
                imgur + "rbfVLm8.png",
                imgur + "PlAiIoT.png",
                imgur + "SPaSFKm.png",
                imgur + "C9PbJi8.png",
                imgur + "lGpIWNJ.png",
                imgur + "gHSUj4O.png",
                imgur + "1eUJFXg.png",
                imgur + "ZNEfhcZ.png",
                imgur + "JpP6WVP.png",
                imgur + "QX43rbX.png",
                imgur + "SRvmcnD.png",
                imgur + "10pg7DJ.png",
                imgur + "Atnj71U.png",
                imgur + "NpvYL9e.png",
                imgur + "egHo3Ce.png",
                imgur + "DFP7eYW.png",
                imgur + "hqB4yKd.png",
                imgur + "9g2vos8.png",
                imgur + "qpNKhsC.png",
                urlimage + "/sdp/mos/nclogo1601369553927.png",
                imgur + "8jjubUD.png",
                imgur + "yzaxw6y.png",
                imgur + "TUKLarg.jpg"
        };

        for (int index = 0; index < titlechannels.length; ++index)
        {
            radio.add(ByPassChannel(titlechannels[index], description[index], videoUrlchannels[index], cardImageUrlchannels[index]));
        }
        return radio;
    }

    private static Movie ByPassChannel(String title, String description, String videoUrl, String cardImageUrl)
    {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl("https://jeka345.github.io/background_app2.png");
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}