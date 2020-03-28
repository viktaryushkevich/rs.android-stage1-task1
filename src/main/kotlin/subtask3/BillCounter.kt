package subtask3

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val realBill = (bill.sum() - bill[k]) / 2
        if (realBill == b) {
            return "Bon Appetit"
        } else {
            return (b - realBill).toString()
        }
    }
}
