package com.github.emilskadikis.androidcrashcourse.repositories
import com.github.emilskadikis.androidcrashcourse.data.Comic
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

class FakeComicRepository : IComicRepository {
    //TODO 9 (Advanced): Fetch latest comic from the api. Suggestion: use third party library Volley
    //Api url: https://xkcd.com/info.0.json
    @UnstableDefault
    override fun getLatestComic(): Comic {
        val json = Json(JsonConfiguration(
            strictMode = false
        ))
        return json.parse(Comic.serializer(), "{\"month\": \"7\", \"num\": 2176, \"link\": \"\", \"year\": \"2019\", \"news\": \"\", \"safe_title\": \"How Hacking Works\", \"transcript\": \"\", \"alt\": \"If only somebody had warned them that the world would roll them like this.\", \"img\": \"https://imgs.xkcd.com/comics/how_hacking_works.png\", \"title\": \"How Hacking Works\", \"day\": \"15\"}")
    }
}