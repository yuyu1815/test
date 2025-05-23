/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\b\007\030\000 \n2\0020\001:\001\nB+\b\000\022\"\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0040\003j\016\022\004\022\0020\004\022\004\022\0020\004`\005¢\006\002\020\006J\006\020\007\032\0020\bJ\b\020\t\032\004\030\0010\004R*\020\002\032\036\022\004\022\0020\004\022\004\022\0020\0040\003j\016\022\004\022\0020\004\022\004\022\0020\004`\005X\016¢\006\002\n\000¨\006\013"}, d2 = {"Lai/grazie/gec/model/problem/ProblemConditionAnalyzer;", "", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "hasRemainingData", "", "removeSuppressableKind", "Companion", "model-gec"})
/*    */ public final class ProblemConditionAnalyzer {
/*    */   public ProblemConditionAnalyzer(@NotNull HashMap<String, String> map) {
/*  6 */     this.map = map;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String removeSuppressableKind() {
/* 18 */     String s = this.map.get("suppressableKind");
/* 19 */     if (CollectionsKt.contains(supKindsV1, s)) {
/* 20 */       this.map.remove("suppressableKind");
/* 21 */       return s;
/*    */     } 
/* 23 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean hasRemainingData() {
/* 31 */     return !this.map.isEmpty();
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\020\016\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lai/grazie/gec/model/problem/ProblemConditionAnalyzer$Companion;", "", "()V", "supKindsV1", "", "", "suppressableKindAttr", "model-gec"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/* 36 */   public static final Companion Companion = new Companion(null); @NotNull private HashMap<String, String> map; @NotNull public static final String suppressableKindAttr = "suppressableKind"; @NotNull private static final Set<String> supKindsV1; static { String[] arrayOfString = new String[4]; arrayOfString[0] = "UPPERCASE_SENTENCE_START"; arrayOfString[1] = "INCOMPLETE_SENTENCE"; arrayOfString[2] = "UNFINISHED_SENTENCE"; arrayOfString[3] = "UNDECORATED_SENTENCE_SEPARATION"; supKindsV1 = SetsKt.setOf((Object[])arrayOfString); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemConditionAnalyzer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */