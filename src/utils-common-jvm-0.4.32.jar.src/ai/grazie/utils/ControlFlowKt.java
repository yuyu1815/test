/*    */ package ai.grazie.utils;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\032<\020\000\032\002H\001\"\004\b\000\020\001*\002H\0012\006\020\002\032\0020\0032\027\020\004\032\023\022\004\022\002H\001\022\004\022\0020\0060\005¢\006\002\b\007H\bø\001\000¢\006\002\020\b\032J\020\t\032\002H\001\"\004\b\000\020\001\"\004\b\001\020\n*\002H\0012\b\020\002\032\004\030\001H\n2\035\020\004\032\031\022\004\022\002H\001\022\004\022\002H\n\022\004\022\0020\0060\013¢\006\002\b\007H\bø\001\000¢\006\002\020\f\032<\020\r\032\002H\001\"\004\b\000\020\001*\002H\0012\006\020\016\032\0020\0032\027\020\004\032\023\022\004\022\002H\001\022\004\022\002H\0010\005¢\006\002\b\007H\bø\001\000¢\006\002\020\b\032J\020\017\032\002H\001\"\004\b\000\020\001\"\004\b\001\020\n*\002H\0012\b\020\002\032\004\030\001H\n2\035\020\004\032\031\022\004\022\002H\001\022\004\022\002H\n\022\004\022\002H\0010\013¢\006\002\b\007H\bø\001\000¢\006\002\020\f\002\007\n\005\b20\001¨\006\020"}, d2 = {"applyIf", "T", "value", "", "body", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "applyIfNotNull", "K", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "chainIf", "condition", "chainIfNotNull", "utils-common"})
/*    */ public final class ControlFlowKt {
/*    */   public static final <T> T chainIf(Object $this$chainIf, boolean condition, @NotNull Function1 body) {
/*  4 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$chainIf = 0; return condition ? 
/*  5 */       (T)body.invoke($this$chainIf) : 
/*    */       
/*  7 */       (T)$this$chainIf;
/*    */   }
/*    */ 
/*    */   
/*    */   public static final <T, K> T chainIfNotNull(Object $this$chainIfNotNull, @Nullable Object value, @NotNull Function2 body) {
/* 12 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$chainIfNotNull = 0; return (value != null) ? 
/* 13 */       (T)body.invoke($this$chainIfNotNull, value) : 
/*    */       
/* 15 */       (T)$this$chainIfNotNull;
/*    */   }
/*    */ 
/*    */   
/*    */   public static final <T, K> T applyIfNotNull(Object $this$applyIfNotNull, @Nullable Object value, @NotNull Function2 body) {
/* 20 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$applyIfNotNull = 0; if (value != null) {
/* 21 */       body.invoke($this$applyIfNotNull, value);
/*    */     }
/*    */     
/* 24 */     return (T)$this$applyIfNotNull;
/*    */   }
/*    */   
/*    */   public static final <T> T applyIf(Object $this$applyIf, boolean value, @NotNull Function1 body) {
/* 28 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$applyIf = 0; if (value) {
/* 29 */       body.invoke($this$applyIf);
/*    */     }
/* 31 */     return (T)$this$applyIf;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\ControlFlowKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */