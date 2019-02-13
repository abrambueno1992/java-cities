package com.abrahambueno.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SeedDatabase {
    @Bean
    public CommandLineRunner initDB(CitiesRepository cityrepos) {
        return args -> {
            log.info("Seeding " + cityrepos.save(new Cities("Akron, Ohio",135000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Albany, N.Y.",182000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Albuquerque, N.M.",167000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Allentown, Pa.",175000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Atlanta, Ga.",210000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Augusta, Ga.",155000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Austin, Texas",290000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Bakersfield, Calif.",215000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Baltimore, Md.",248000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Baton Rouge, La.",168000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Birmingham, Ala.",153000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Boise, Idaho",260000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Boston, Mass.",410000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Bridgeport, Conn.",356000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Buffalo, N.Y.",141000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Cape Coral, Fla.",209000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Charleston, S.C.",239000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Charlotte, N.C.",204000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Chattanooga, Tenn.",158000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Chicago, Ill.",215000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Cincinnati, Ohio",158000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Cleveland, Ohio",128000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Colorado Springs, Colo.",280000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Columbia, S.C.",139000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Columbus, Ohio",180000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Dallas, Texas",195000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Dayton, Ohio",120000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Deltona, Fla.",191000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Denver, Colo.",383000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Des Moines, Iowa",173000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Detroit, Mich.",157000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Durham, N.C.",220000,3);
            log.info("Seeding " + cityrepos.save(new Cities("El Paso, Texas",124000,6);
            log.info("Seeding " + cityrepos.save(new Cities("Fayetteville, Ark.",180000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Fresno, Calif.",250000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Grand Rapids, Mich.",182000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Greensboro, N.C.",140000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Greenville, S.C.",170000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Harrisburg, Pa.",163000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Hartford, Conn.",209000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Honolulu, Hi.",600000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Houston, Texas",178000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Indianapolis, Ind.",125000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Jacksonville, Fla.",195000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Kansas Cities, Mo.",143000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Knoxville, Tenn.",162000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Lakeland, Fla.",165000,6);
            log.info("Seeding " + cityrepos.save(new Cities("Lancaster, Pa.",190000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Las Vegas, Nev.",266000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Little Rock, Ark.",145000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Los Angeles, Calif.",634000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Louisville, Ky.",168000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Madison, Wis.",250000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Memphis, Tenn.",142000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Miami, Fla.",255000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Milwaukee, Wis.",179000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Minneapolis-St. Paul, Minn.",252000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Modesto, CA",295000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Nashville, Tenn.",247000,6);
            log.info("Seeding " + cityrepos.save(new Cities("New Haven, Conn.",194000,6);
            log.info("Seeding " + cityrepos.save(new Cities("New Orleans, La.",184000,4);
            log.info("Seeding " + cityrepos.save(new Cities("New York, N.Y.-N.J.",410000,10);
            log.info("Seeding " + cityrepos.save(new Cities("North Port-Sarasota, Fla.",234000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Ogden, Utah",214000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Oklahoma Cities, Okla.",148000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Omaha, Neb.",180000,6);
            log.info("Seeding " + cityrepos.save(new Cities("Orlando, Fla.",220000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Oxnard, Calif.",589000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Palm Bay, Fla.",185000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Philadelphia, Pa.",205000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Phoenix, Ariz.",252000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Pittsburgh, Pa.",138000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Portland, Ore.",370000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Providence, R.I.",262000,6);
            log.info("Seeding " + cityrepos.save(new Cities("Raleigh, N.C.",246000,6);
            log.info("Seeding " + cityrepos.save(new Cities("Richmond, Va.",226000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Riverside-San Bernardino, Calif.",339000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Rochester, N.Y.",137000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Sacramento, Calif.",375000,8);
            log.info("Seeding " + cityrepos.save(new Cities("Salt Lake Cities, Utah",255000,9);
            log.info("Seeding " + cityrepos.save(new Cities("San Antonio, Texas",153000,6);
            log.info("Seeding " + cityrepos.save(new Cities("San Diego, Calif.",545000,10);
            log.info("Seeding " + cityrepos.save(new Cities("San Francisco, Calif.",860000,10);
            log.info("Seeding " + cityrepos.save(new Cities("San Jose, Calif.",1100000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Scranton-Wilkes-Barre, Pa.",100000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Seattle, Wash.",430000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Spokane, Wash.",228000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Springfield, Mass.",200000,6);
            log.info("Seeding " + cityrepos.save(new Cities("St. Louis, Mo.",157000,4);
            log.info("Seeding " + cityrepos.save(new Cities("Stockton, Calif.",335000,10);
            log.info("Seeding " + cityrepos.save(new Cities("Syracuse, N.Y.",112000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Tampa, Fla.",189000,5);
            log.info("Seeding " + cityrepos.save(new Cities("Toledo, Ohio",109000,1);
            log.info("Seeding " + cityrepos.save(new Cities("Tucson, Ariz.",198000,6);
            log.info("Seeding " + cityrepos.save(new Cities("Tulsa, Okla.",146000,3);
            log.info("Seeding " + cityrepos.save(new Cities("Virginia Beach, Va.",217000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Washington, D.C.-No. Va.",375000,9);
            log.info("Seeding " + cityrepos.save(new Cities("Winston-Salem, N.C.",144000,2);
            log.info("Seeding " + cityrepos.save(new Cities("Worcester, Mass.",241000,7);
            log.info("Seeding " + cityrepos.save(new Cities("Youngstown, Ohio",77000,1);
        }
    }
}
