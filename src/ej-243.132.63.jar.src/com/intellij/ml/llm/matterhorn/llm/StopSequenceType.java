/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\002\030\000 \0062\b\022\004\022\0020\0000\001:\001\006B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "", "<init>", "(Ljava/lang/String;I)V", "STOP_BEFORE", "STOP_AFTER", "Companion", "core"})
/*    */ public enum StopSequenceType
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "core"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<StopSequenceType> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/* 39 */   STOP_BEFORE,
/* 40 */   STOP_AFTER; static { Companion = new Companion(null);
/* 41 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.StopSequenceType", (Enum[])values())); } @NotNull public static EnumEntries<StopSequenceType> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\StopSequenceType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */