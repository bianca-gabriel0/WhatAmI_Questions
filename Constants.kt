package com.example.riddle

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //Question 1
        val que1 = Question(1, "What goes up but never comes down?", "1", "Age", "3", 2)
        questionsList.add(que1)

        //Question 2
        val que2 = Question(2, "I’m tall when I’m young, and I’m short when I'm old.", "Candle", "2", "3", 1)
        questionsList.add(que2)

        //Question 3
        val que3 = Question(3, "What has to be broken before you can use it?", "1", "2", "Egg", 3)
        questionsList.add(que3)

        //Question 4
        val que4 = Question(4, "What is full of holes but still holds water?", "Sponge", "2", "3", 1)
        questionsList.add(que4)

        //Question 5
        val que5 = Question(5, "I shave every day. But my beard stays the same. What am I?", "1", "Barber", "3", 2)
        questionsList.add(que5)

        return questionsList
    }

}