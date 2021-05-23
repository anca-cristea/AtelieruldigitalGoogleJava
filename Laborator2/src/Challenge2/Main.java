package Challenge2;

public class Main {
    public static void main(String[] args) {
//        Actor a1 = new Actor("Jennifer",35, new Premiu[]{new Premiu("Oscar",2020)});
//        Actor a2 = new Actor("Tom",35, null);
//
//        Film f1 = new Film(2020,"Film de Oscar", new Actor[]{a1,a2});
//        Film f2 = new Film(2021,"Film simplu", new Actor[]{a1});
//
//        Studio s1 = new Studio("Creative", new Film[]{f1,f2,f1,f2,f1});
//        Studio s2 = new Studio("First studio", new Film[]{f1,f2});
//
//        Studio[] studios = new Studio[]{s1,s2};
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[] {oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[] {actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar2", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.println("Studio-urile care au mai mult de 2 filme publicate sunt:");
        for(int i=0;i<studioDatabase.length;i++){
            if(studioDatabase[i].publishedMoreThanTwo()){
                System.out.println(studioDatabase[i]);
            }
        }

        System.out.println("Studio-urile cu filme in care a jucat <actor cu 2 oscaruri> sunt:");
        for(int i=0;i<studioDatabase.length;i++){
            if(studioDatabase[i].hasCertainActor("actor cu 2 oscaruri")){
                System.out.println(studioDatabase[i]);
            }
        }

        Film[] filmDatabase = new Film[]{film1,film2,film3,film4,film5};
        System.out.println("Filmele in care a jucat un actor peste 50 de ani sunt:");
        for(int i=0;i<filmDatabase.length;i++){
            if(filmDatabase[i].hasActorAbove50()){
                System.out.println(filmDatabase[i]);
            }
        }
    }
}