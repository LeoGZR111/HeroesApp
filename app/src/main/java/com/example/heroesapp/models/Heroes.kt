package com.example.heroesapp.models

data class Heroes(val id : Int, val name : String, val description : String, val image : String, val heroeId : Int){
    companion object {
        val heroes = mutableListOf<Heroes>(
            //Marvel Heroes
            Heroes(1, "Spider-Man", "A young superhero with spider-like abilities.", "https://static.wikia.nocookie.net/spiderman/images/9/9c/Web_of_Spider-Man_Vol_1_129.1_Sin_texto.png/revision/latest/thumbnail/width/360/height/360?cb=20190317173958&path-prefix=es", 1),
            Heroes(2, "Iron Man", "A genius billionaire in an advanced suit of armor.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKhuLTBrMzrVhh_mtU-5Vqnmkj3M_kcwWAVg&s", 1),
            Heroes(3, "Thor", "The god of thunder from Asgard.", "https://upload.wikimedia.org/wikipedia/en/thumb/3/3c/Chris_Hemsworth_as_Thor.jpg/220px-Chris_Hemsworth_as_Thor.jpg", 1),
            Heroes(4, "Captain America", "A super-soldier with enhanced strength and agility.", "https://static.wikia.nocookie.net/disney/images/f/fa/Captain-America-AOU-Render.png/revision/latest/thumbnail/width/360/height/360?cb=20180420015558&path-prefix=es", 1),
            Heroes(5, "Hulk", "A scientist who transforms into a powerful green monster.", "https://www.ecured.cu/images/a/a6/HULK.jpg", 1),
            Heroes(6, "Black Widow", "A highly trained spy and assassin.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8CffdwqjsNReT2WOQZT8SG0dZSDglrkniDQ&s", 1),
            Heroes(7, "Doctor Strange", "A sorcerer with the ability to manipulate magic.", "https://i.pinimg.com/564x/83/1f/01/831f015888b5a0cd588e89b865ed12d0.jpg", 1),
            Heroes(8, "Black Panther", "The king of Wakanda with enhanced abilities.", "https://upload.wikimedia.org/wikipedia/en/9/9f/Black_Panther_OS_Vol_1_2.png", 1),
            Heroes(9, "Scarlet Witch", "A mutant with the ability to manipulate reality.", "https://sm.ign.com/t/ign_latam/screenshot/default/maximoff_23g2.1280.jpg", 1),
            Heroes(10, "Ant-Man", "A hero who can shrink or grow in size at will.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyiqYzNR8eARWBAVvi8zZa1LMpSwYsl8CzxQ&s", 1),

            // DC Heroes
            Heroes(11, "Superman", "The last son of Krypton with incredible strength and flight.", "https://static.wikia.nocookie.net/personajes-de-ficcion-database/images/6/64/Superman.png/revision/latest?cb=20200909145020&path-prefix=es", 2),
            Heroes(12, "Batman", "A vigilante detective who fights crime in Gotham.", "https://cdn.forbes.com.mx/2020/03/Batman-.jpg", 2),
            Heroes(13, "Wonder Woman", "An Amazonian princess with godlike abilities.", "https://static.wikia.nocookie.net/personajes-de-ficcion-database/images/d/dc/Wonder_Woman_render.png/revision/latest?cb=20201112215419&path-prefix=es", 2),
            Heroes(14, "The Flash", "The fastest man alive, with the ability to run at super speeds.", "https://i.blogs.es/c883f0/the-flash-hbo-max-mexico/840_560.jpeg", 2),
            Heroes(15, "Aquaman", "The king of Atlantis with control over water and marine life.", "https://img.asmedia.epimg.net/resizer/v2/QQHNBSPTSFM7LCM4XUQ35NLOSE.jpg?auth=67509b945fccf28a46376f26ee352c41765cdd702c44167106ec505b0d9f239c&width=1200&height=1200&smart=true", 2),
            Heroes(16, "Cyborg", "A man merged with advanced technology, enhancing his abilities.", "https://static.wikia.nocookie.net/dcextendeduniverse/images/2/2a/Victor_Stone.png/revision/latest?cb=20240104055756&path-prefix=es", 2),
            Heroes(17, "Green Lantern", "A hero with a power ring that creates constructs from energy.", "https://static.wikia.nocookie.net/batman/images/8/88/Linterna-verde.jpg/revision/latest?cb=20170921191634&path-prefix=es", 2),
            Heroes(18, "Shazam", "A young boy who transforms into a powerful superhero by saying 'Shazam!'.", "https://static.wikia.nocookie.net/personajes-de-ficcion-database/images/6/6d/Shazam-0.jpg/revision/latest?cb=20190921230227&path-prefix=es", 2),
            Heroes(19, "Green Arrow", "A skilled archer and vigilante with a variety of trick arrows.", "https://i.pinimg.com/736x/77/65/47/776547b0b2e50793c57e1bbf4c8cb49a.jpg", 2),
            Heroes(20, "Martian Manhunter", "A shape-shifting alien with telepathy and strength.", "https://preview.redd.it/orbklic5y2wc1.jpeg?auto=webp&s=17e19a491085e02a3996f229948649b5be49fa2f", 2)
        )
    }
}
