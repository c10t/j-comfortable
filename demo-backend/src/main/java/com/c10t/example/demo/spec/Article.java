package com.c10t.example.demo.spec;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Article {
  private final long id;
  private final String title;
}
