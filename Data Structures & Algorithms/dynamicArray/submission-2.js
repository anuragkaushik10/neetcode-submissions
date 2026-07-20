class DynamicArray {
    /**
     * @constructor
     * @param {number} capacity
     */
    constructor(capacity) {
        this.arr = new Array(capacity);
        this.size = 0; // Track actual number of elements
    }

    /**
     * @param {number} i
     * @returns {number}
     */
    get(i) {
        if (i >= 0 && i < this.size) {
            return this.arr[i];
        }
        return -1;
    }

    /**
     * @param {number} i
     * @param {number} n
     * @returns {void}
     */
    set(i, n) {
        if (i >= 0 && i < this.size) {
            this.arr[i] = n;
        }
        return null;
    }

    /**
     * @param {number} n
     * @returns {void}
     */
    pushback(n) {
        if (this.size === this.arr.length) {
            this.resize();
        }
        this.arr[this.size] = n;
        this.size++;
    }

    /**
     * @returns {void}
     */
    popback() {
        if (this.size > 0) {
            this.size--;
            return this.arr[this.size];
        }
        return -1; 
    }

    /**
     * @returns {void}
     */
    resize() {
        let length = this.arr.length;
        let brr = new Array(length * 2);
        for (let i = 0; i < length; i++) {
            brr[i] = this.arr[i];
        }
        this.arr = brr;
    }

    /**
     * @returns {number}
     */
    getSize() {
        return this.size;
    }

    /**
     * @returns {number}
     */
    getCapacity() {
        return this.arr.length;
    }
}