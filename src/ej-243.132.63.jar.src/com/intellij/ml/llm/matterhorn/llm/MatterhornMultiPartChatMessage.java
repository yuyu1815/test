/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B\035\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bB5\b\020\022\006\020\t\032\0020\n\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\017\020\030\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\031\032\0020\006HÆ\003J#\020\032\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020\nHÖ\001J\t\020 \032\0020\023HÖ\001J%\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\016\020\017R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\020\020\021R\033\020\022\032\0020\0238VX\002¢\006\f\n\004\b\026\020\027\032\004\b\024\020\025¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "parts", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "kind", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "<init>", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getParts", "()Ljava/util/List;", "getKind", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;", "content", "", "getContent", "()Ljava/lang/String;", "content$delegate", "Lkotlin/Lazy;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class MatterhornMultiPartChatMessage
/*     */   implements MatterhornChatElement
/*     */ {
/*     */   @NotNull
/* 107 */   public static final Companion Companion = new Companion(null); @NotNull private final List<MatterhornChatMessagePart> parts; @NotNull private final MatterhornChatMessageKind kind; @NotNull private final Lazy content$delegate; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageImagePart.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageTextPart.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageToolResultPart.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)MatterhornChatMessageImagePart.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornChatMessageTextPart.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornChatMessageToolResultPart.$serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart", Reflection.getOrCreateKotlinClass(MatterhornChatMessagePart.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind", (Enum[])MatterhornChatMessageKind.values()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornMultiPartChatMessage> serializer() { return (KSerializer<MatterhornMultiPartChatMessage>)MatterhornMultiPartChatMessage.$serializer.INSTANCE; } }
/*     */    @NotNull
/* 109 */   public final List<MatterhornChatMessagePart> getParts() { return this.parts; } public MatterhornMultiPartChatMessage(@NotNull List<MatterhornChatMessagePart> parts, @NotNull MatterhornChatMessageKind kind) { this.parts = parts;
/* 110 */     this.kind = kind;
/*     */     
/* 112 */     this.content$delegate = LazyKt.lazy(this::content_delegate$lambda$1); } @NotNull public MatterhornChatMessageKind getKind() { return this.kind; } @NotNull public String getContent() { Lazy lazy = this.content$delegate; return (String)lazy.getValue(); } private static final CharSequence content_delegate$lambda$1$lambda$0(MatterhornChatMessagePart it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getRepresentation(); } private static final String content_delegate$lambda$1(MatterhornMultiPartChatMessage this$0) { return CollectionsKt.joinToString$default(this$0.parts, "\n", null, null, 0, null, MatterhornMultiPartChatMessage::content_delegate$lambda$1$lambda$0, 30, null); } private static final CharSequence _init_$lambda$3$lambda$2(MatterhornChatMessagePart it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getRepresentation(); } private static final String _init_$lambda$3(MatterhornMultiPartChatMessage this$0) { return CollectionsKt.joinToString$default(this$0.parts, "\n", null, null, 0, null, MatterhornMultiPartChatMessage::_init_$lambda$3$lambda$2, 30, null); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<MatterhornChatMessagePart> component1() {
/*     */     return this.parts;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChatMessageKind component2() {
/*     */     return this.kind;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornMultiPartChatMessage copy(@NotNull List<? extends MatterhornChatMessagePart> parts, @NotNull MatterhornChatMessageKind kind) {
/*     */     Intrinsics.checkNotNullParameter(parts, "parts");
/*     */     Intrinsics.checkNotNullParameter(kind, "kind");
/*     */     return new MatterhornMultiPartChatMessage(parts, kind);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MatterhornMultiPartChatMessage(parts=" + this.parts + ", kind=" + this.kind + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.parts.hashCode();
/*     */     return result * 31 + this.kind.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornMultiPartChatMessage))
/*     */       return false; 
/*     */     MatterhornMultiPartChatMessage matterhornMultiPartChatMessage = (MatterhornMultiPartChatMessage)other;
/*     */     return !Intrinsics.areEqual(this.parts, matterhornMultiPartChatMessage.parts) ? false : (!(this.kind != matterhornMultiPartChatMessage.kind));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornMultiPartChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */