package com.example.subs;

import java.util.ArrayList;

public class Data {
    private static String[] sneakersNames = {
            "adidas x Reebok Instapump Fury BOOST",
            "Air Jordan 1 SB “LA to Chicago”",
            "Awake NY x ASICS GEL-Kayano 5 360",
            "Cactus Plant Flea Market x Nike VaporMax 2019",
            "Hajime Sorayama x Dior B23 Sneaker",
            "SpongeBob SquarePants x Nike Kyrie 5 “SpongeBob”",
            "Aimé Leon Dore x New Balance 990v5”",
            "BAPE x adidas UltraBOOST",
            "Palace x Salomon Speedcross 4",
            "Bodega x New Balance 997S “No Days Off”"
    };

    private static String[] sneakersKeterangan = {
            "They say there’s nothing new under the sun, and that often rings true when it comes to collaborative sneakers. Once a rare and special occurrence, collaborations are now seemingly released on a daily basis, but adidas and Reebok’s Instapump Fury BOOST was a true first in every sense of the word, and by virtue of that, one of the year’s most singular silhouettes.\n" +
                    "\n" +
                    "A much more advanced version of the brand-to-brand partnerships first started by the use of Nike Lunarlon foam in Cole Haan dress shoes or the Converse Chuck Taylor 2, the adidas x Reebok Instapump Fury BOOST is the confluence of two of the world’s biggest sneaker brands and their most influential tech. Although both may be under the same corporate umbrella, this doesn’t dull the impact. The design bridges both decades and history-defining advancements in technology by melding together the Pump fit system and BOOST cushioning, not to mention adding both brands’ signature marks side-by-side on the midfoot. It’s rare that you see a new avenue of collaboration in today’s occasionally saturated market, but this is just that: the combination of one footwear juggernaut’s most recognizable silhouette with another’s most-lauded cushioning system."
            ,"Thanks to renewed interest caused by the cyclical nature of sneaker collecting and co-signs from the likes of Travis Scott and Virgil Abloh, Nike SB enjoyed the beginning of a renaissance in 2019, one of the foremost proprietors of which was the Air Jordan 1 SB “LA to Chicago.” Since its original release in 1985, the AJ1 has been embraced by basketball players and skateboarders alike, so this in-brand collaboration nodded to that juxtaposition with both design and details.\n" +
            "\n" +
            "Featuring the wear-away detailing first popularized by Lance Mountain, the shoe’s Los Angeles Lakers-style gold and purple outer layer strips away with wear, giving way to a Chicago Bulls-esque mix of red and black on its base layer. Nodding to both the nexus of skateboarding and the city that made Michael Jordan an icon, the Air Jordan 1 SB “LA to Chicago” managed to encompass two key pieces of footwear history, while presenting a rich take on one of the most popular silhouettes in the world of sneakers today, certainly no small feat."
            ,"How does a footwear brand acknowledge and amplify its past while still pushing towards its future? This is a difficult, ever-evolving question, and ASICS answered it in compelling fashion this year with the hybrid GEL-Kayano 5 360 silhouette. Mixing an OG GEL-Kayano 5 upper with a modern, full-length GEL-Quantum 360 midsole, the Kayano 5 360 presented the perfect blend of old and new.\n" +
            "\n" +
            "The shoe’s appeal was aided by a duo of thoughtful collaborations with Angelo Baque’s buzzy Awake NY: one of which acknowledged Baque’s hometown of Queens and the famous Unisphere in Flushing Meadow Park with its silver and green colorway; the other of which nodded to Parisian nights with a glistening gold and black mixture. The co-created effort opened the door for in-line and special releases alike, ranging from remakes of classic colorways to rugged, GORE-TEX equipped styles, perfect for the winter months."
            ,"Cynthia Lu’s Cactus Plant Flea Market was one of Nike’s most productive collaborative partners in 2019, and its pièce de résistance was a whimsical, women’s-sized take on the VaporMax 2019. Lu’s signature perfectly-imperfect stylings and warm, amicable point of view provided an undeniably compelling juxtaposition with the VaporMax 2019’s advanced tech and materials, thanks to embellishments like three-dimensional Swooshes and wrapping “Just Do It” text. This was taken even further on a special friends-and-family edition, which featured a neon light detail.\n" +
            "\n" +
            "Although CPFM followed this up with a duo of vivid Nike By You collections centered around the Blazer Mid and a hybrid Air Force 1/Air More Uptempo, its first effort was certainly its most impactful, and left the sneaker-loving general public wanting even more in 2020."
            ,"After leaving Louis Vuitton, the incomparable Kim Jones kicked off his career at Dior with hit after hit. From collaborating with KAWS on a compelling capsule collection to calling upon Matthew M Williams’ ALYX 1017 9SM for its signature hardware, nobody in high fashion did streetwear in a more authentic way than Jones. He had his first footwear sensation at Dior thanks to the B23 silhouette — a shoe that looks somewhat like Converse’s Chuck Taylor.\n" +
            "\n" +
            "Although the monogrammed, translucent makeup of the B23 was the most commonly spotted, his most unique style today is an iteration created with Japanese illustrator Hajime Sorayama. Known for his highly detailed, typically erotic portrayals of robots, Sorayama’s mechanical machinations yielded a metallic T-Rex graphic on the B23’s upper, mixed with sublimated Dior print and colorful floral hits. All of this made for the most vivid high-fashion shoe of the year and a design that boasts the highest MSRP on this list by far — $1,100 USD."
            ,"It’s been 20 years since SpongeBob SquarePants first bubbled onto Nickelodeon in 1999, so this year was full of tributes to the smiling sponge and his beloved cast of side characters. The most notable was Brooklyn Nets point guard Kyrie Irving and Nike’s collaborative “SpongeBob” collection, made up of three Kyrie 5s and two Kyrie Low 2s.\n" +
            "\n" +
            "One of the NBA’s most unique personalities, Irving has long been open about his adoration for SpongeBob, and this light-hearted, inherently fun collection was well-regarded across sneaker culture. Many factors played a part in this — historical significance, instantly recognizable colors, and nostalgia — but nothing translated sponge to sneaker more than the collection’s little details, making sure that SpongeBob, his best pal Patrick Star, his clarinet-playing coworker Squidward, greedy boss Mr. Krabs and the ever-upbeat astronaut squirrel Sandy Cheeks were all given their proper moment in the spotlight. The paradigm of how branded property sneaker collaborations should be done, the SpongeBob SquarePants x Nike Kyrie collection garnered acclaim, became a pop culture moment and — above all else — was just plain fun."
            ,"The fifth installment in New Balance’s lauded 990 family, the 990v5 enjoyed a successful inaugural year on the market, the finest result of which was Aimé Leon Dore’s collaborative take. Acknowledging the line’s wide-reaching appeal, the 990v5 was accompanied by a clever “Worn by supermodels in London and dads in Ohio” campaign, something ALD clearly took to heart in crafting its versatile, elegant and highly exclusive navy and forest green style. Equal parts sleek (the midsole) and sturdy (the inherently classic upper), the 990v5 marked a new generation of “dad shoes.” ALD did this so well in fact, that the NYPD shut down the drop at the brand’s Mulberry Street flagship due to a boisterous crowd that raised safety concerns. "
            ," Although the once-unquenchable demand for the adidas UltraBOOST has certainly cooled off since its Kanye West-approved heyday in 2015-2016, the Trefoil brand’s flagship runner can still garner quite the response — especially when it’s equipped with BAPE’s signature camouflage patterns. Arriving in both greyscale and classic woodland camo, the two iterations of the shoe were the centerpieces of a football-themed collection that released during Super Bowl LIII weekend, and to championship-level fanfare. Sure, maybe they’d have had more of an impact a few years ago, but for 2019, they take their place on our Honorable Mentions List. "
            ,"It’s still a core skate brand at heart, but Lev Tanju and Gareth Skewis’s Palace is nothing short of polymathic, able to successfully translate its clever, cheeky ethos onto any product they choose. Nowhere was this more apparent in 2019 than on the collaborative Salomon Speedcross 4, a release that few saw coming and even fewer were able to purchase. Palace took the high-tech hiker shoe trend that’s been gaining momentum over the past few years, especially with thanks to Saloman, and added its signature Cockney style. This made for a versatile design, equally appropriate for the rugged hiker as it was for the stylish roadman. "
            ,"The steadily popular New Balance 997 was brought into the modern world with the 997S this past year, and no makeup of the fresh-yet-familiar hybrid silhouette was more warmly received than Bodega’s “No Days Off” iteration. With a moniker drawing from the brand’s running history but with a bold colorway that was unquestionably lifestyle-geared, the “No Days Off” was one of 2019’s biggest surprise hits, selling out instantly and fetching high three-figure sums on the aftermarket. It was then followed up by a “No Bad Days” style in the fall.\n" +
            "\n" +
            "This fervent fandom for a silhouette that the casual sneakerhead might have missed completely shows that in a market that can seem to be inherently stacked in favor of heritage styles, all you need is the right design, a good colorway, a compelling tale and a popular partner to produce a hit."
    };

    private static int[] sneakersImages = {
            R.drawable.adidasxreebok,
            R.drawable.air_jordan,
            R.drawable.gel_kayano,
            R.drawable.vapormax,
            R.drawable.dior,
            R.drawable.kyrie,
            R.drawable.leon_dore,
            R.drawable.ultraboost,
            R.drawable.speedcross,
            R.drawable.newbalance
    };

    static ArrayList<GetterSetterData> getListData (){
            ArrayList<GetterSetterData> list = new ArrayList<>();
            for(int position = 0; position < sneakersNames.length ; position++)
            {
                GetterSetterData getterSetterData = new GetterSetterData();
                getterSetterData.setNames(sneakersNames[position]);
                getterSetterData.setKeterangan(sneakersKeterangan[position]);
                getterSetterData.setImages(sneakersImages[position]);
                list.add(getterSetterData);
            }
            return list;
    }




}
