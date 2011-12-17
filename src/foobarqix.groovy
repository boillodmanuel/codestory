class ChallengeHelper {
    static m = [3:'Foo', 5:'Bar', 7:'Qix'] as TreeMap

    static divideTransform (Integer self){
        m.collect { k, v ->
            m[k] && self % k == 0 ? v : '' 
        }.join()
    }
    static containsTransform (Integer self){
        (self as String).collect { s ->
            m[s as int] ?: ''
        }.join()
    }

}

use (ChallengeHelper){
    (1..100).each {i -> 
        println i.divideTransform() + i.containsTransform() ?: i
    }
}
