/*    */ package ai.grazie.utils.mpp;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\020\023\n\000\n\002\020\b\n\002\b\002\n\002\020\006\n\002\b\003\n\002\020$\n\002\b\004\n\002\020\002\n\002\020%\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\032\n\020\000\032\0020\001*\0020\001\032\022\020\002\032\0020\003*\0020\0032\006\020\004\032\0020\003\032\025\020\005\032\0020\006*\0020\0062\006\020\004\032\0020\006H\004\032\025\020\005\032\0020\006*\0020\0062\006\020\004\032\0020\003H\004\032\025\020\005\032\0020\006*\0020\0032\006\020\004\032\0020\006H\004\032\025\020\005\032\0020\003*\0020\0032\006\020\004\032\0020\003H\004\0327\020\007\032\002H\b\"\004\b\000\020\t\"\004\b\001\020\b*\016\022\004\022\002H\t\022\004\022\002H\b0\n2\006\020\013\032\002H\t2\006\020\f\032\002H\b¢\006\002\020\r\0327\020\016\032\0020\017\"\004\b\000\020\t\"\004\b\001\020\b*\016\022\004\022\002H\t\022\004\022\002H\b0\0202\006\020\013\032\002H\t2\006\020\021\032\002H\b¢\006\002\020\022\032\022\020\023\032\0020\024*\0020\0252\006\020\026\032\0020\027¨\006\030"}, d2 = {"clone", "", "floorDiv", "", "other", "floorMod", "", "getOrDefault", "V", "K", "", "key", "default", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putIfAbsent", "", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "rangeIn", "Lkotlin/ranges/IntRange;", "Lkotlin/text/MatchGroup;", "text", "", "utils-common"})
/*    */ public final class PolyfillsKt { @NotNull
/*    */   public static final IntRange rangeIn(@NotNull MatchGroup $this$rangeIn, @NotNull String text) {
/*  4 */     Intrinsics.checkNotNullParameter($this$rangeIn, "<this>"); Intrinsics.checkNotNullParameter(text, "text"); int start = StringsKt.indexOf$default(text, $this$rangeIn.getValue(), 0, false, 6, null);
/*  5 */     int end = start + $this$rangeIn.getValue().length();
/*  6 */     return new IntRange(start, end - 1);
/*    */   }
/*    */   @NotNull
/*    */   public static final double[] clone(@NotNull double[] $this$clone) {
/* 10 */     Intrinsics.checkNotNullParameter($this$clone, "<this>"); double[] cloned = new double[$this$clone.length]; byte b; int i;
/* 11 */     for (b = 0, i = $this$clone.length; b < i; ) { int j = b; double value = $this$clone[b];
/* 12 */       cloned[j] = value; b++; }
/*    */     
/* 14 */     return cloned;
/*    */   }
/*    */   public static final double floorMod(double $this$floorMod, double other) {
/* 17 */     return ($this$floorMod % other + other) % other;
/*    */   } public static final int floorMod(int $this$floorMod, int other) {
/* 19 */     return ($this$floorMod % other + other) % other;
/*    */   } public static final double floorMod(double $this$floorMod, int other) {
/* 21 */     return ($this$floorMod % other + other) % other;
/*    */   } public static final double floorMod(int $this$floorMod, double other) {
/* 23 */     return ($this$floorMod % other + other) % other;
/*    */   }
/*    */   public static final int floorDiv(int $this$floorDiv, int other) {
/* 26 */     int q = $this$floorDiv / other;
/* 27 */     if (($this$floorDiv ^ other) < 0 && q * other != $this$floorDiv) q--; 
/* 28 */     return q;
/*    */   }
/*    */   public static final <K, V> V getOrDefault(@NotNull Map $this$getOrDefault, Object key, Object default) {
/* 31 */     Intrinsics.checkNotNullParameter($this$getOrDefault, "<this>"); if ($this$getOrDefault.get(key) == null) $this$getOrDefault.get(key);  return (V)default;
/*    */   }
/*    */   public static final <K, V> void putIfAbsent(@NotNull Map<Object, Object> $this$putIfAbsent, Object key, Object value) {
/* 34 */     Intrinsics.checkNotNullParameter($this$putIfAbsent, "<this>"); if (!$this$putIfAbsent.containsKey(key))
/* 35 */       $this$putIfAbsent.put(key, value); 
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\PolyfillsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */