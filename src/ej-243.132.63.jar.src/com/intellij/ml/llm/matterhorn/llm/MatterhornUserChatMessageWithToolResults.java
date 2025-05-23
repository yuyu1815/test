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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+B\037\022\f\020\002\032\b\022\004\022\0020\0040\003\022\b\b\002\020\005\032\0020\006¢\006\004\b\007\020\bB!\b\026\022\006\020\t\032\0020\006\022\006\020\005\032\0020\006\022\006\020\n\032\0020\013¢\006\004\b\007\020\fB?\b\020\022\006\020\r\032\0020\016\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\b\020\017\032\004\030\0010\020\022\b\020\021\032\004\030\0010\022¢\006\004\b\007\020\023J\b\020\032\032\0020\006H\026J\017\020\033\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\034\032\0020\006HÆ\003J#\020\035\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\036\032\0020\0132\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\016HÖ\001J%\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(H\001¢\006\002\b)R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\024\020\025R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\026\020\027R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\030\020\031¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "toolResults", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "content", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "id", "isError", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "kind", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToolResults", "()Ljava/util/List;", "getContent", "()Ljava/lang/String;", "getKind", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornUserChatMessageWithToolResults
/*     */   implements MatterhornChatElement
/*     */ {
/*     */   @NotNull
/* 171 */   public static final Companion Companion = new Companion(null); @NotNull private final List<MatterhornToolResult> toolResults; @NotNull private final String content; @NotNull private final MatterhornChatMessageKind kind; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)MatterhornToolResult.$serializer.INSTANCE); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind", (Enum[])MatterhornChatMessageKind.values()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornUserChatMessageWithToolResults> serializer() { return (KSerializer<MatterhornUserChatMessageWithToolResults>)MatterhornUserChatMessageWithToolResults.$serializer.INSTANCE; }
/*     */      }
/* 173 */   public MatterhornUserChatMessageWithToolResults(@NotNull List<MatterhornToolResult> toolResults, @NotNull String content) { this.toolResults = toolResults;
/* 174 */     this.content = content;
/*     */ 
/*     */ 
/*     */     
/* 178 */     this.kind = MatterhornChatMessageKind.User; } @NotNull public final List<MatterhornToolResult> getToolResults() { return this.toolResults; } @NotNull public MatterhornChatMessageKind getKind() { return this.kind; }
/*     */   @NotNull public String getContent() { return this.content; }
/* 180 */   public MatterhornUserChatMessageWithToolResults(@NotNull String id, @NotNull String content, boolean isError) { this(CollectionsKt.listOf(new MatterhornToolResult(id, content, isError, null, 8, null)), null, 2, null); } @NotNull public String toString() { StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-MatterhornUserChatMessageWithToolResults$toString$1 = 0;
/* 181 */     if ((((CharSequence)getContent()).length() > 0)) {
/* 182 */       Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(getContent()), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(getContent()).append('\n'), "append(...)"); $this$toString_u24lambda_u241.append(getContent()).append('\n');
/* 183 */     }  CollectionsKt.joinTo$default(this.toolResults, $this$toString_u24lambda_u241, "\n", null, null, 0, null, MatterhornUserChatMessageWithToolResults::toString$lambda$1$lambda$0, 60, null); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); } private static final CharSequence toString$lambda$1$lambda$0(MatterhornToolResult it) { Intrinsics.checkNotNullParameter(it, "it"); return it.toString(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<MatterhornToolResult> component1() {
/*     */     return this.toolResults;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornUserChatMessageWithToolResults copy(@NotNull List<MatterhornToolResult> toolResults, @NotNull String content) {
/*     */     Intrinsics.checkNotNullParameter(toolResults, "toolResults");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new MatterhornUserChatMessageWithToolResults(toolResults, content);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.toolResults.hashCode();
/*     */     return result * 31 + this.content.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornUserChatMessageWithToolResults))
/*     */       return false; 
/*     */     MatterhornUserChatMessageWithToolResults matterhornUserChatMessageWithToolResults = (MatterhornUserChatMessageWithToolResults)other;
/*     */     return !Intrinsics.areEqual(this.toolResults, matterhornUserChatMessageWithToolResults.toolResults) ? false : (!!Intrinsics.areEqual(this.content, matterhornUserChatMessageWithToolResults.content));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornUserChatMessageWithToolResults.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */