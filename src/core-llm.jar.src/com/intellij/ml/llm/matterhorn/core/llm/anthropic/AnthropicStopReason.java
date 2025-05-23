/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\b\b\002\030\000 \b2\b\022\004\022\0020\0000\001:\001\bB\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "", "<init>", "(Ljava/lang/String;I)V", "END_TURN", "MAX_TOKENS", "STOP_SEQUENCE", "TOOL_USE", "Companion", "core-llm"})
/*    */ public enum AnthropicStopReason
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/* 51 */   END_TURN,
/*    */   
/* 53 */   MAX_TOKENS,
/*    */   
/* 55 */   STOP_SEQUENCE,
/*    */   
/* 57 */   TOOL_USE; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AnthropicStopReason> serializer() { return get$cachedSerializer(); } } static { Companion = new Companion(null); $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> {
/*    */           String[] arrayOfString = new String[4]; arrayOfString[0] = "end_turn"; arrayOfString[1] = "max_tokens"; arrayOfString[2] = "stop_sequence"; arrayOfString[3] = "tool_use"; Annotation[][] arrayOfAnnotation = new Annotation[4][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; arrayOfAnnotation[3] = null; return (Function0)EnumsKt.createAnnotatedEnumSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicStopReason", (Enum[])values(), arrayOfString, arrayOfAnnotation, null);
/* 59 */         }); } @NotNull public static EnumEntries<AnthropicStopReason> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicStopReason.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */