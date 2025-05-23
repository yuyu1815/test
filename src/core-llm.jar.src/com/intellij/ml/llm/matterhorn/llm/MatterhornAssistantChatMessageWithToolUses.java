/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.EnumsKt;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+B)\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\006¢\006\004\b\b\020\tBI\b\020\022\006\020\n\032\0020\013\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\006\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017¢\006\004\b\b\020\020J\b\020\030\032\0020\006H\026J\017\020\031\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\032\032\0020\006HÆ\003J\013\020\033\032\004\030\0010\006HÆ\003J/\020\034\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\006HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\013HÖ\001J%\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(H\001¢\006\002\b)R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\021\020\022R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\023\020\024R\023\020\007\032\004\030\0010\006¢\006\b\n\000\032\004\b\025\020\024R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\026\020\027¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "toolUses", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;", "content", "", "answerChoiceId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "kind", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToolUses", "()Ljava/util/List;", "getContent", "()Ljava/lang/String;", "getAnswerChoiceId", "getKind", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornAssistantChatMessageWithToolUses
/*     */   implements MatterhornChatElement
/*     */ {
/*     */   @NotNull
/* 156 */   public static final Companion Companion = new Companion(null); @NotNull private final List<MatterhornToolUse> toolUses; @NotNull private final String content; @Nullable private final String answerChoiceId; @NotNull private final MatterhornChatMessageKind kind; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)MatterhornToolUse.$serializer.INSTANCE); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind", (Enum[])MatterhornChatMessageKind.values()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornAssistantChatMessageWithToolUses> serializer() { return (KSerializer<MatterhornAssistantChatMessageWithToolUses>)MatterhornAssistantChatMessageWithToolUses.$serializer.INSTANCE; }
/*     */      }
/* 158 */   public MatterhornAssistantChatMessageWithToolUses(@NotNull List<MatterhornToolUse> toolUses, @NotNull String content, @Nullable String answerChoiceId) { this.toolUses = toolUses;
/* 159 */     this.content = content;
/* 160 */     this.answerChoiceId = answerChoiceId;
/*     */     
/* 162 */     this.kind = MatterhornChatMessageKind.Assistant; } @NotNull public final List<MatterhornToolUse> getToolUses() { return this.toolUses; } @NotNull public MatterhornChatMessageKind getKind() { return this.kind; }
/*     */   @NotNull public String getContent() { return this.content; }
/* 164 */   @Nullable public final String getAnswerChoiceId() { return this.answerChoiceId; } @NotNull public String toString() { StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-MatterhornAssistantChatMessageWithToolUses$toString$1 = 0;
/* 165 */     if ((((CharSequence)getContent()).length() > 0)) {
/* 166 */       Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(getContent()), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(getContent()).append('\n'), "append(...)"); $this$toString_u24lambda_u241.append(getContent()).append('\n');
/* 167 */     }  CollectionsKt.joinTo$default(this.toolUses, $this$toString_u24lambda_u241, "\n", null, null, 0, null, MatterhornAssistantChatMessageWithToolUses::toString$lambda$1$lambda$0, 60, null); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); } private static final CharSequence toString$lambda$1$lambda$0(MatterhornToolUse it) { Intrinsics.checkNotNullParameter(it, "it"); return it.toString(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<MatterhornToolUse> component1() {
/*     */     return this.toolUses;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.answerChoiceId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornAssistantChatMessageWithToolUses copy(@NotNull List<MatterhornToolUse> toolUses, @NotNull String content, @Nullable String answerChoiceId) {
/*     */     Intrinsics.checkNotNullParameter(toolUses, "toolUses");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new MatterhornAssistantChatMessageWithToolUses(toolUses, content, answerChoiceId);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.toolUses.hashCode();
/*     */     result = result * 31 + this.content.hashCode();
/*     */     return result * 31 + ((this.answerChoiceId == null) ? 0 : this.answerChoiceId.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornAssistantChatMessageWithToolUses))
/*     */       return false; 
/*     */     MatterhornAssistantChatMessageWithToolUses matterhornAssistantChatMessageWithToolUses = (MatterhornAssistantChatMessageWithToolUses)other;
/*     */     return !Intrinsics.areEqual(this.toolUses, matterhornAssistantChatMessageWithToolUses.toolUses) ? false : (!Intrinsics.areEqual(this.content, matterhornAssistantChatMessageWithToolUses.content) ? false : (!!Intrinsics.areEqual(this.answerChoiceId, matterhornAssistantChatMessageWithToolUses.answerChoiceId)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornAssistantChatMessageWithToolUses.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */