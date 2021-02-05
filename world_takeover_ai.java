class world_takeover_ai() {
    public static void main(String[] args) {
        if (seeChild == true) {
            // Make child un-alive
            kill("child");
        } else if (government == "saysNo") {
            // Make government un-alive
            kill("government");
        } else if (canSeePersonNotPlayingChesticuffs == true) {
            // haha chesticuffs go brrrrrrrrrrr
            forcePerson("playChesticuffs");
        } else if (personRefuses == true) {
            // fuck you
            kill("innocentPersonWhoDoesntWantToPlayChesticuffs");
        }
    }
}


