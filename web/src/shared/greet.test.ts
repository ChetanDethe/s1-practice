import { describe, expect, it } from 'vitest'
import { greet } from './greet'

describe('greet', () => {
    // A name is greeted.
    it('greets a name', () => {
        expect(greet('Ana')).toBe('Hello, Ana!')
    })

    // An empty name greets the world.
    it('greets the world without a name', () => {
        expect(greet(' ')).toBe('Hello, world!')
    })
})
