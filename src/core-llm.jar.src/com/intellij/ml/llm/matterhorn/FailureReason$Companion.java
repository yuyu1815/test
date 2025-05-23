/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
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
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/FailureReason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/FailureReason;", "core"})
/*     */ public final class Companion
/*     */ {
/*     */   @NotNull
/*     */   public final KSerializer<FailureReason> serializer() {
/* 117 */     KClass[] arrayOfKClass = new KClass[9]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(FailureReason.BadResponseException.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(FailureReason.ContextLengthExceeded.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(FailureReason.CostExceeded.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(FailureReason.CountryForbidden.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(FailureReason.FormatError.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(FailureReason.InferenceServerTimeout.class); arrayOfKClass[6] = Reflection.getOrCreateKotlinClass(FailureReason.PaymentRequired.class); arrayOfKClass[7] = Reflection.getOrCreateKotlinClass(FailureReason.ProblemsWithShell.class); arrayOfKClass[8] = Reflection.getOrCreateKotlinClass(FailureReason.UnexpectedException.class); KSerializer[] arrayOfKSerializer = new KSerializer[9]; arrayOfKSerializer[0] = (KSerializer)FailureReason.BadResponseException.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)FailureReason.ContextLengthExceeded.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)FailureReason.CostExceeded.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)FailureReason.CountryForbidden.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)FailureReason.FormatError.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)FailureReason.InferenceServerTimeout.$serializer.INSTANCE; arrayOfKSerializer[6] = (KSerializer)FailureReason.PaymentRequired.$serializer.INSTANCE; arrayOfKSerializer[7] = (KSerializer)FailureReason.ProblemsWithShell.$serializer.INSTANCE; arrayOfKSerializer[8] = (KSerializer)FailureReason.UnexpectedException.$serializer.INSTANCE; return (KSerializer<FailureReason>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.FailureReason", Reflection.getOrCreateKotlinClass(FailureReason.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\FailureReason$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */