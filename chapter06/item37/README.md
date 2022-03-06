## Item 37: Use EnumMap instead of ordinal indexing

It's rarely appropriate to use ordinals index into arrays:
use `EnumMap` instead. If the relationship you are representing is multidimensional,
use `EnumMap<..., EnumMap<...>>`. This is a special case of the general principle
that application programmers should rarely, if ever, use `Enum.ordinal` (Item 35).
