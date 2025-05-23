/*   */ package ai.grazie.debug;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0202\0020\001:\001\020B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\0032\b\020\n\032\004\030\0010\013HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\017HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/debug/DebugData;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "provideDebugInfo", "", "(Z)V", "getProvideDebugInfo", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Key", "model-common"}) public final class DebugData extends AbstractCoroutineContextElement { @NotNull public static final Key Key = new Key(null); private final boolean provideDebugInfo; public boolean equals(@Nullable Object other) { if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof DebugData))
/*   */       return false; 
/*   */     DebugData debugData = (DebugData)other;
/* 7 */     return !(this.provideDebugInfo != debugData.provideDebugInfo); } public final boolean getProvideDebugInfo() { return this.provideDebugInfo; }
/* 8 */   public int hashCode() { return Boolean.hashCode(this.provideDebugInfo); } @NotNull public String toString() { return "DebugData(provideDebugInfo=" + this.provideDebugInfo + ")"; } @NotNull public final DebugData copy(boolean provideDebugInfo) { return new DebugData(provideDebugInfo); } public final boolean component1() { return this.provideDebugInfo; } public DebugData(boolean provideDebugInfo) { super(Key);
/*   */     this.provideDebugInfo = provideDebugInfo; }
/*   */ 
/*   */   
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/debug/DebugData$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lai/grazie/debug/DebugData;", "()V", "model-common"})
/*   */   public static final class Key implements CoroutineContext.Key<DebugData> {
/*   */     private Key() {}
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-common-jvm-0.4.32.jar!\ai\grazie\debug\DebugData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */