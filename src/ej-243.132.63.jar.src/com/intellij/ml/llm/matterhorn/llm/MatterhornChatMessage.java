/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.DoubleSerializer;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\006\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,B5\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\020\b\002\020\006\032\n\022\004\022\0020\b\030\0010\007\022\n\b\002\020\t\032\004\030\0010\003¢\006\004\b\n\020\013BI\b\020\022\006\020\f\032\0020\r\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\003\022\b\020\016\032\004\030\0010\017¢\006\004\b\n\020\020J\b\020\030\032\0020\003H\026J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\005HÆ\003J\021\020\033\032\n\022\004\022\0020\b\030\0010\007HÆ\003J\013\020\034\032\004\030\0010\003HÆ\003J;\020\035\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\020\b\002\020\006\032\n\022\004\022\0020\b\030\0010\0072\n\b\002\020\t\032\004\030\0010\003HÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010!HÖ\003J\t\020\"\032\0020\rHÖ\001J%\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)H\001¢\006\002\b*R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\024R\031\020\006\032\n\022\004\022\0020\b\030\0010\007¢\006\b\n\000\032\004\b\025\020\026R\023\020\t\032\004\030\0010\003¢\006\b\n\000\032\004\b\027\020\022¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "content", "", "kind", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "logits", "", "", "answerChoiceId", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent", "()Ljava/lang/String;", "getKind", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "getLogits", "()Ljava/util/List;", "getAnswerChoiceId", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class MatterhornChatMessage
/*    */   implements MatterhornChatElement
/*    */ {
/*    */   @NotNull
/* 45 */   public static final Companion Companion = new Companion(null); @NotNull private final String content; @NotNull private final MatterhornChatMessageKind kind; @Nullable private final List<Double> logits; @Nullable private final String answerChoiceId; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind", (Enum[])MatterhornChatMessageKind.values()); arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)DoubleSerializer.INSTANCE); arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornChatMessage> serializer() { return (KSerializer<MatterhornChatMessage>)MatterhornChatMessage.$serializer.INSTANCE; }
/*    */      }
/* 47 */   public MatterhornChatMessage(@NotNull String content, @NotNull MatterhornChatMessageKind kind, @Nullable List<Double> logits, @Nullable String answerChoiceId) { this.content = content;
/* 48 */     this.kind = kind;
/* 49 */     this.logits = logits;
/* 50 */     this.answerChoiceId = answerChoiceId; } @NotNull public String getContent() { return this.content; } @Nullable public final String getAnswerChoiceId() { return this.answerChoiceId; }
/*    */   @NotNull public MatterhornChatMessageKind getKind() { return this.kind; }
/*    */   @Nullable
/*    */   public final List<Double> getLogits() { return this.logits; } @NotNull
/* 54 */   public String toString() { String role = 
/* 55 */       (WhenMappings.$EnumSwitchMapping$0[getKind().ordinal()] == 1) ? "user" : 
/* 56 */       "assistant";
/*    */     
/* 58 */     return 
/*    */ 
/*    */       
/* 61 */       StringsKt.trimMargin$default("{\n      |  \\\"role\\\": " + role + ",\n      |  \\\"content\\\": " + getContent() + "\n      |}", null, 1, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornChatMessageKind component2() {
/*    */     return this.kind;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<Double> component3() {
/*    */     return this.logits;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.answerChoiceId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornChatMessage copy(@NotNull String content, @NotNull MatterhornChatMessageKind kind, @Nullable List<Double> logits, @Nullable String answerChoiceId) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(kind, "kind");
/*    */     return new MatterhornChatMessage(content, kind, logits, answerChoiceId);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.content.hashCode();
/*    */     result = result * 31 + this.kind.hashCode();
/*    */     result = result * 31 + ((this.logits == null) ? 0 : this.logits.hashCode());
/*    */     return result * 31 + ((this.answerChoiceId == null) ? 0 : this.answerChoiceId.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MatterhornChatMessage))
/*    */       return false; 
/*    */     MatterhornChatMessage matterhornChatMessage = (MatterhornChatMessage)other;
/*    */     return !Intrinsics.areEqual(this.content, matterhornChatMessage.content) ? false : ((this.kind != matterhornChatMessage.kind) ? false : (!Intrinsics.areEqual(this.logits, matterhornChatMessage.logits) ? false : (!!Intrinsics.areEqual(this.answerChoiceId, matterhornChatMessage.answerChoiceId))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */