/*    */ package ai.grazie.nlc;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\000 \0242\0020\001:\001\024B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\003HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\007R\021\020\t\032\0020\0038F¢\006\006\032\004\b\n\020\007¨\006\025"}, d2 = {"Lai/grazie/nlc/CompletionTextSplit;", "", "context", "", "prefix", "(Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getPrefix", "text", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "model-nlc"})
/*    */ public final class CompletionTextSplit {
/*  6 */   public CompletionTextSplit(@NotNull String context, @NotNull String prefix) { this.context = context; this.prefix = prefix; } @NotNull public final String getContext() { return this.context; } @NotNull public final String getPrefix() { return this.prefix; }
/*    */   @NotNull
/*  8 */   public final String getText() { return this.context + this.context; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/nlc/CompletionTextSplit$Companion;", "", "()V", "empty", "Lai/grazie/nlc/CompletionTextSplit;", "getEmpty", "()Lai/grazie/nlc/CompletionTextSplit;", "model-nlc"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 11 */     public final CompletionTextSplit getEmpty() { return CompletionTextSplit.empty; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String context; @NotNull private final String prefix; @NotNull private static final CompletionTextSplit empty = new CompletionTextSplit("", "");
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CompletionTextSplit copy(@NotNull String context, @NotNull String prefix) {
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     return new CompletionTextSplit(context, prefix);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CompletionTextSplit(context=" + this.context + ", prefix=" + this.prefix + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.context.hashCode();
/*    */     return result * 31 + this.prefix.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CompletionTextSplit))
/*    */       return false; 
/*    */     CompletionTextSplit completionTextSplit = (CompletionTextSplit)other;
/*    */     return !Intrinsics.areEqual(this.context, completionTextSplit.context) ? false : (!!Intrinsics.areEqual(this.prefix, completionTextSplit.prefix));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlc-jvm-0.4.32.jar!\ai\grazie\nlc\CompletionTextSplit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */