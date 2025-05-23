/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\002\b\002\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\t\b\002¢\006\004\b\002\020\003J\016\020\007\032\n\022\006\b\001\022\0020\t0\bj\002\b\004j\002\b\005j\002\b\006¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;", "", "<init>", "(Ljava/lang/String;I)V", "RankingCritique", "NebiusCritique", "EditCritique", "getCritiqueArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "Companion", "ej-core"})
/*    */ public enum Critiques {
/* 11 */   RankingCritique,
/* 12 */   NebiusCritique,
/* 13 */   EditCritique; @NotNull public static final Companion Companion; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.critique.Critiques", (Enum[])values())); }
/*    */   @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;", "ej-core"}) public static final class Companion {
/* 16 */     private Companion() {} @NotNull public final KSerializer<Critiques> serializer() { return get$cachedSerializer(); } } @NotNull public final ArtifactType<? extends CritiqueResponse> getCritiqueArtifactType() { switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) { case 1: case 2: case 3:  }  throw new NoWhenBranchMatchedException(); }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static EnumEntries<Critiques> getEntries() {
/* 22 */     return $ENTRIES;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\Critiques.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */