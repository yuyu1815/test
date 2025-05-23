/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\002\030\000 \t2\b\022\004\022\0020\0000\001:\001\tB\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "UPDATED", "FINISHED", "CANCELLED", "FAILED", "Companion", "core"})
/*    */ public enum ArtifactStatus {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/* 17 */   CREATED,
/* 18 */   UPDATED,
/* 19 */   FINISHED,
/* 20 */   CANCELLED,
/* 21 */   FAILED; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatus;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ArtifactStatus> serializer() { return get$cachedSerializer(); } } static { Companion = new Companion(null);
/* 22 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ArtifactStatus", (Enum[])values())); } @NotNull public static EnumEntries<ArtifactStatus> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactStatus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */