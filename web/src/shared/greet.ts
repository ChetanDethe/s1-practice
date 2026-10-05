/** Makes a greeting; an empty name greets the world. */
export function greet(name: string): string {
    const who = name.trim() || 'world'
    return `Hello, ${who}!`
}
