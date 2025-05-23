/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\032\016\020\002\032\0020\0032\006\020\004\032\0020\003\032\016\020\005\032\0020\0062\006\020\004\032\0020\003\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\007"}, d2 = {"concedeToOtherGrammarCheckersKey", "", "cleanInternalStuff", "Lai/grazie/gec/model/problem/Problem;", "p", "concedeToOtherGrammarCheckers", "", "model-gec"})
/*    */ public final class ProblemUtilsKt {
/*  8 */   public static final boolean concedeToOtherGrammarCheckers(@NotNull Problem p) { Intrinsics.checkNotNullParameter(p, "p"); p.getExperimental().getMap(); return Intrinsics.areEqual((p.getExperimental() != null && p.getExperimental().getMap() != null) ? p.getExperimental().getMap().get("concedeToOtherGrammarCheckers") : null, "true"); } @NotNull
/*    */   public static final String concedeToOtherGrammarCheckersKey = "concedeToOtherGrammarCheckers"; @NotNull
/*    */   public static final Problem cleanInternalStuff(@NotNull Problem p) { StringProperties experimental;
/* 11 */     Intrinsics.checkNotNullParameter(p, "p"); if (p.getExperimental() == null) { p.getExperimental(); return p; }
/* 12 */      Map updated = MapsKt.minus(experimental.getMap(), "concedeToOtherGrammarCheckers");
/* 13 */     return Problem.copy$default(p, null, null, null, null, updated.isEmpty() ? null : StringProperties.Companion.fromMap(updated), null, null, 111, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */