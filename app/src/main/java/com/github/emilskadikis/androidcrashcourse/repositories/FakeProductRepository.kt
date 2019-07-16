package com.github.emilskadikis.androidcrashcourse.repositories

import com.github.emilskadikis.androidcrashcourse.data.Product

class FakeProductRepository() {
    fun getProducts(): List<Product> {
       return listOf(
           Product(
               name = "Paper",
               price = 3.99,
               description = "Box of 100 sheets of printer paper."
           ),
           Product(
               name = "Staples",
               price = 5.2,
               description = "100 staples in boxes of 10."
           ),
           Product(
               name = "Pencil",
               price = 0.12,
               description = "2B pencil."
           ),
           Product(
               name = "Printer ink",
               price = 99.98,
               description = "Set of all colour ink cartridges for a laser printer. This description is too long to be displayed in the list."
           )
       )
    }
}