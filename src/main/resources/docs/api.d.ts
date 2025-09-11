export class CsvIO {
    /**
     * Parse a CSV document from a string. See docs/usage.md in the mod jar for an example.
     * 
     * @param document the CSV document.
     */
    parse(document: string): Array<any>

    /**
     * Read a CSV document from the file system. See docs/usage.md in the mod jar for an example.
     * Note that KubeJS forbids file system access to files outside the game directory.
     * 
     * @param path path to the CSV file.
     */
    read(path: string|java.nio.file.Path): Array<any>

    /**
     * Serialize an array of JavaScript objects to a CSV document string.
     * 
     * @param content the array of JavaScript objects.
     * @returns the CSV document, with all keys found in every objects in {@link content}
     */
    toString(content: Array<any>): string

    /**
     * Write an array of JavaScript objects as a CSV document to the file system.
     * Note that KubeJS forbids file system access to files outside the game directory.
     * 
     * @param path path to the CSV file.
     * @param content the array of JavaScript objects.
     */
    write(path: string|java.nio.file.Path, content: Array<any>): void

    /**
     * Deletes a CSV document from the file system.
     * This is same as `write(path, null)`, added for better readability.
     * 
     * @param path path to the CSV file.
     */
    delete(path: string|java.nio.file.Path): void
}
