fn identity<T>(v: T) -> T { v }

fn main() {
    println!("yo man {}, {}", identity("Hello, world!"), identity(5));
}
