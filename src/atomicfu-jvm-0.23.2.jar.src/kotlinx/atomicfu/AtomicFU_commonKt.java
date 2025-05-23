/*     */ package kotlinx.atomicfu;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\t\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\001\n\000\n\002\020\002\n\002\b\003\032\036\020\000\032\n\022\006\022\004\030\001H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H\007\032$\020\005\032\0020\006*\0020\0072\022\020\b\032\016\022\004\022\0020\006\022\004\022\0020\0060\tH\bø\001\000\032$\020\005\032\0020\004*\0020\n2\022\020\b\032\016\022\004\022\0020\004\022\004\022\0020\0040\tH\bø\001\000\032$\020\005\032\0020\013*\0020\f2\022\020\b\032\016\022\004\022\0020\013\022\004\022\0020\0130\tH\bø\001\000\0325\020\005\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\r2\022\020\b\032\016\022\004\022\002H\002\022\004\022\002H\0020\tH\bø\001\000¢\006\002\020\016\032$\020\017\032\0020\020*\0020\0072\022\020\021\032\016\022\004\022\0020\006\022\004\022\0020\0220\tH\bø\001\000\032$\020\017\032\0020\020*\0020\n2\022\020\021\032\016\022\004\022\0020\004\022\004\022\0020\0220\tH\bø\001\000\032$\020\017\032\0020\020*\0020\f2\022\020\021\032\016\022\004\022\0020\013\022\004\022\0020\0220\tH\bø\001\000\0320\020\017\032\0020\020\"\004\b\000\020\002*\b\022\004\022\002H\0020\r2\022\020\021\032\016\022\004\022\002H\002\022\004\022\0020\0220\tH\bø\001\000\032$\020\023\032\0020\022*\0020\0072\022\020\b\032\016\022\004\022\0020\006\022\004\022\0020\0060\tH\bø\001\000\032$\020\023\032\0020\022*\0020\n2\022\020\b\032\016\022\004\022\0020\004\022\004\022\0020\0040\tH\bø\001\000\032$\020\023\032\0020\022*\0020\f2\022\020\b\032\016\022\004\022\0020\013\022\004\022\0020\0130\tH\bø\001\000\0320\020\023\032\0020\022\"\004\b\000\020\002*\b\022\004\022\002H\0020\r2\022\020\b\032\016\022\004\022\002H\002\022\004\022\002H\0020\tH\bø\001\000\032$\020\024\032\0020\006*\0020\0072\022\020\b\032\016\022\004\022\0020\006\022\004\022\0020\0060\tH\bø\001\000\032$\020\024\032\0020\004*\0020\n2\022\020\b\032\016\022\004\022\0020\004\022\004\022\0020\0040\tH\bø\001\000\032$\020\024\032\0020\013*\0020\f2\022\020\b\032\016\022\004\022\0020\013\022\004\022\0020\0130\tH\bø\001\000\0325\020\024\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\r2\022\020\b\032\016\022\004\022\002H\002\022\004\022\002H\0020\tH\bø\001\000¢\006\002\020\016\002\007\n\005\b20\001¨\006\025"}, d2 = {"atomicArrayOfNulls", "Lkotlinx/atomicfu/AtomicArray;", "T", "size", "", "getAndUpdate", "", "Lkotlinx/atomicfu/AtomicBoolean;", "function", "Lkotlin/Function1;", "Lkotlinx/atomicfu/AtomicInt;", "", "Lkotlinx/atomicfu/AtomicLong;", "Lkotlinx/atomicfu/AtomicRef;", "(Lkotlinx/atomicfu/AtomicRef;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "loop", "", "action", "", "update", "updateAndGet", "atomicfu"})
/*     */ public final class AtomicFU_commonKt
/*     */ {
/*     */   @NotNull
/*     */   public static final <T> AtomicArray<T> atomicArrayOfNulls(int size) {
/* 113 */     return new AtomicArray<>(size);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <T> Void loop(@NotNull AtomicRef $this$loop, @NotNull Function1 action) {
/* 154 */     Intrinsics.checkNotNullParameter($this$loop, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$loop = 0; while (true) {
/* 155 */       action.invoke($this$loop.getValue());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> void update(@NotNull AtomicRef<Object> $this$update, @NotNull Function1 function) {
/*     */     Object cur, upd;
/* 163 */     Intrinsics.checkNotNullParameter($this$update, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$update = 0; do {
/* 164 */       cur = $this$update.getValue();
/* 165 */       upd = function.invoke(cur);
/* 166 */     } while (!$this$update.compareAndSet(cur, upd));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> T getAndUpdate(@NotNull AtomicRef<Object> $this$getAndUpdate, @NotNull Function1 function) {
/* 174 */     Intrinsics.checkNotNullParameter($this$getAndUpdate, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$getAndUpdate = 0; while (true) {
/* 175 */       Object cur = $this$getAndUpdate.getValue();
/* 176 */       Object upd = function.invoke(cur);
/* 177 */       if ($this$getAndUpdate.compareAndSet(cur, upd)) return (T)cur;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> T updateAndGet(@NotNull AtomicRef<Object> $this$updateAndGet, @NotNull Function1 function) {
/* 185 */     Intrinsics.checkNotNullParameter($this$updateAndGet, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$updateAndGet = 0; while (true) {
/* 186 */       Object cur = $this$updateAndGet.getValue();
/* 187 */       Object upd = function.invoke(cur);
/* 188 */       if ($this$updateAndGet.compareAndSet(cur, upd)) return (T)upd;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Void loop(@NotNull AtomicBoolean $this$loop, @NotNull Function1 action) {
/* 233 */     Intrinsics.checkNotNullParameter($this$loop, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$loop = 0; while (true) {
/* 234 */       action.invoke(Boolean.valueOf($this$loop.getValue()));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void update(@NotNull AtomicBoolean $this$update, @NotNull Function1 function) {
/*     */     boolean cur, upd;
/* 242 */     Intrinsics.checkNotNullParameter($this$update, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$update = 0; do {
/* 243 */       cur = $this$update.getValue();
/* 244 */       upd = ((Boolean)function.invoke(Boolean.valueOf(cur))).booleanValue();
/* 245 */     } while (!$this$update.compareAndSet(cur, upd));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean getAndUpdate(@NotNull AtomicBoolean $this$getAndUpdate, @NotNull Function1 function) {
/* 253 */     Intrinsics.checkNotNullParameter($this$getAndUpdate, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$getAndUpdate = 0; while (true) {
/* 254 */       boolean cur = $this$getAndUpdate.getValue();
/* 255 */       boolean upd = ((Boolean)function.invoke(Boolean.valueOf(cur))).booleanValue();
/* 256 */       if ($this$getAndUpdate.compareAndSet(cur, upd)) return cur;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean updateAndGet(@NotNull AtomicBoolean $this$updateAndGet, @NotNull Function1 function) {
/* 264 */     Intrinsics.checkNotNullParameter($this$updateAndGet, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$updateAndGet = 0; while (true) {
/* 265 */       boolean cur = $this$updateAndGet.getValue();
/* 266 */       boolean upd = ((Boolean)function.invoke(Boolean.valueOf(cur))).booleanValue();
/* 267 */       if ($this$updateAndGet.compareAndSet(cur, upd)) return upd;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Void loop(@NotNull AtomicInt $this$loop, @NotNull Function1 action) {
/* 350 */     Intrinsics.checkNotNullParameter($this$loop, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$loop = 0; while (true) {
/* 351 */       action.invoke(Integer.valueOf($this$loop.getValue()));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void update(@NotNull AtomicInt $this$update, @NotNull Function1 function) {
/*     */     int cur, upd;
/* 359 */     Intrinsics.checkNotNullParameter($this$update, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$update = 0; do {
/* 360 */       cur = $this$update.getValue();
/* 361 */       upd = ((Number)function.invoke(Integer.valueOf(cur))).intValue();
/* 362 */     } while (!$this$update.compareAndSet(cur, upd));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getAndUpdate(@NotNull AtomicInt $this$getAndUpdate, @NotNull Function1 function) {
/* 370 */     Intrinsics.checkNotNullParameter($this$getAndUpdate, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$getAndUpdate = 0; while (true) {
/* 371 */       int cur = $this$getAndUpdate.getValue();
/* 372 */       int upd = ((Number)function.invoke(Integer.valueOf(cur))).intValue();
/* 373 */       if ($this$getAndUpdate.compareAndSet(cur, upd)) return cur;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int updateAndGet(@NotNull AtomicInt $this$updateAndGet, @NotNull Function1 function) {
/* 381 */     Intrinsics.checkNotNullParameter($this$updateAndGet, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$updateAndGet = 0; while (true) {
/* 382 */       int cur = $this$updateAndGet.getValue();
/* 383 */       int upd = ((Number)function.invoke(Integer.valueOf(cur))).intValue();
/* 384 */       if ($this$updateAndGet.compareAndSet(cur, upd)) return upd;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Void loop(@NotNull AtomicLong $this$loop, @NotNull Function1 action) {
/* 467 */     Intrinsics.checkNotNullParameter($this$loop, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$loop = 0; while (true) {
/* 468 */       action.invoke(Long.valueOf($this$loop.getValue()));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void update(@NotNull AtomicLong $this$update, @NotNull Function1 function) {
/*     */     long cur, upd;
/* 476 */     Intrinsics.checkNotNullParameter($this$update, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$update = 0; do {
/* 477 */       cur = $this$update.getValue();
/* 478 */       upd = ((Number)function.invoke(Long.valueOf(cur))).longValue();
/* 479 */     } while (!$this$update.compareAndSet(cur, upd));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long getAndUpdate(@NotNull AtomicLong $this$getAndUpdate, @NotNull Function1 function) {
/* 487 */     Intrinsics.checkNotNullParameter($this$getAndUpdate, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$getAndUpdate = 0; while (true) {
/* 488 */       long cur = $this$getAndUpdate.getValue();
/* 489 */       long upd = ((Number)function.invoke(Long.valueOf(cur))).longValue();
/* 490 */       if ($this$getAndUpdate.compareAndSet(cur, upd)) return cur;
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long updateAndGet(@NotNull AtomicLong $this$updateAndGet, @NotNull Function1 function) {
/* 498 */     Intrinsics.checkNotNullParameter($this$updateAndGet, "<this>"); Intrinsics.checkNotNullParameter(function, "function"); int $i$f$updateAndGet = 0; while (true) {
/* 499 */       long cur = $this$updateAndGet.getValue();
/* 500 */       long upd = ((Number)function.invoke(Long.valueOf(cur))).longValue();
/* 501 */       if ($this$updateAndGet.compareAndSet(cur, upd)) return upd; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\AtomicFU_commonKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */