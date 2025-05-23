/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import java.util.List;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0060\003¢\006\004\b\007\020\bB;\b\020\022\006\020\t\032\0020\006\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\006\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\007\020\fJ\b\020\020\032\0020\021H\026J\017\020\022\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\023\032\b\022\004\022\0020\0060\003HÆ\003J)\020\024\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0060\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\006HÖ\001J%\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037H\001¢\006\002\b R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\r\020\016R\027\020\005\032\b\022\004\022\0020\0060\003¢\006\b\n\000\032\004\b\017\020\016¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "", "critiqueCandidates", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "critiqueRanks", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCritiqueCandidates", "()Ljava/util/List;", "getCritiqueRanks", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nCritiqueHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CritiqueHelpers.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1053#2:50\n*S KotlinDebug\n*F\n+ 1 CritiqueHelpers.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse\n*L\n36#1:50\n*E\n"})
/*    */ public final class CritiqueResponse {
/*    */   @NotNull
/* 28 */   public static final Companion Companion = new Companion(null); @NotNull private final List<MatterhornChatElement> critiqueCandidates; @NotNull private final List<Integer> critiqueRanks; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornMultiPartChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)MatterhornUserChatMessageWithToolResults$.serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)IntSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<CritiqueResponse> serializer() { return (KSerializer<CritiqueResponse>)CritiqueResponse.$serializer.INSTANCE; }
/*    */      }
/* 30 */    public CritiqueResponse(@NotNull List<MatterhornChatElement> critiqueCandidates, @NotNull List<Integer> critiqueRanks) { this.critiqueCandidates = critiqueCandidates;
/* 31 */     this.critiqueRanks = critiqueRanks; } @NotNull public final List<MatterhornChatElement> getCritiqueCandidates() { return this.critiqueCandidates; } @NotNull public final List<Integer> getCritiqueRanks() { return this.critiqueRanks; }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 35 */     List list = CollectionsKt.zip(this.critiqueCandidates, this.critiqueRanks);
/* 36 */     int $i$f$sortedBy = 0;
/* 37 */     return CollectionsKt.joinToString$default(
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
/* 50 */         CollectionsKt.sortedWith(list, new CritiqueResponse$toString$$inlined$sortedBy$1()), "\n", null, null, 0, null, CritiqueResponse::toString$lambda$1, 30, null);
/*    */   }
/*    */   
/*    */   private static final CharSequence toString$lambda$1(Pair it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return StringsKt.trimMargin$default("Rank: " + it.getSecond() + "\n        |\n        |Candidate:\n        |\n        |" + it.getFirst() + "\n        |\n        |------------------------------\n        |", null, 1, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<MatterhornChatElement> component1() {
/*    */     return this.critiqueCandidates;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Integer> component2() {
/*    */     return this.critiqueRanks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CritiqueResponse copy(@NotNull List<? extends MatterhornChatElement> critiqueCandidates, @NotNull List<Integer> critiqueRanks) {
/*    */     Intrinsics.checkNotNullParameter(critiqueCandidates, "critiqueCandidates");
/*    */     Intrinsics.checkNotNullParameter(critiqueRanks, "critiqueRanks");
/*    */     return new CritiqueResponse(critiqueCandidates, critiqueRanks);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.critiqueCandidates.hashCode();
/*    */     return result * 31 + this.critiqueRanks.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CritiqueResponse))
/*    */       return false; 
/*    */     CritiqueResponse critiqueResponse = (CritiqueResponse)other;
/*    */     return !Intrinsics.areEqual(this.critiqueCandidates, critiqueResponse.critiqueCandidates) ? false : (!!Intrinsics.areEqual(this.critiqueRanks, critiqueResponse.critiqueRanks));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\CritiqueResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */