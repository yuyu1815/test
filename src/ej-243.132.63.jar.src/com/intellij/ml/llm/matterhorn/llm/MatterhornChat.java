/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\016\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 82\0020\001:\00278BC\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\016\b\002\020\007\032\b\022\004\022\0020\b0\005\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\003¢\006\004\b\f\020\rBY\b\020\022\006\020\016\032\0020\017\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\b\030\0010\005\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\003\022\b\020\020\032\004\030\0010\021¢\006\004\b\f\020\022J\016\020\033\032\0020\0002\006\020\034\032\0020\006J\036\020\035\032\0020\0002\006\020\036\032\0020\0032\006\020\037\032\0020\0032\006\020 \032\0020!J\020\020\"\032\0020\0002\b\b\002\020#\032\0020\003J\006\020$\032\0020\000J\t\020%\032\0020\003HÆ\003J\017\020&\032\b\022\004\022\0020\0060\005HÆ\003J\017\020'\032\b\022\004\022\0020\b0\005HÆ\003J\t\020(\032\0020\nHÆ\003J\013\020)\032\004\030\0010\003HÆ\003JI\020*\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\016\b\002\020\007\032\b\022\004\022\0020\b0\0052\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\003HÆ\001J\023\020+\032\0020!2\b\020,\032\004\030\0010\001HÖ\003J\t\020-\032\0020\017HÖ\001J\t\020.\032\0020\003HÖ\001J%\020/\032\002002\006\0201\032\0020\0002\006\0202\032\002032\006\0204\032\00205H\001¢\006\002\b6R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\023\020\024R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\025\020\026R\027\020\007\032\b\022\004\022\0020\b0\005¢\006\b\n\000\032\004\b\027\020\026R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\030\020\031R\023\020\013\032\004\030\0010\003¢\006\b\n\000\032\004\b\032\020\024¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "", "system", "", "messages", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "tools", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "toolChoice", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "previousAnswerChoiceId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSystem", "()Ljava/lang/String;", "getMessages", "()Ljava/util/List;", "getTools", "getToolChoice", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "getPreviousAnswerChoiceId", "withNewMessage", "message", "replaceAll", "oldValue", "newValue", "ignoreCase", "", "checkChatForAnthropic", "separator", "checkChatForOpenAI", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornChat.kt\ncom/intellij/ml/llm/matterhorn/llm/MatterhornChat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1557#2:341\n1628#2,2:342\n1557#2:344\n1628#2,2:345\n1246#2,4:349\n1630#2:353\n1557#2:354\n1628#2,3:355\n1557#2:358\n1628#2,3:359\n1630#2:362\n462#3:347\n412#3:348\n1#4:363\n*S KotlinDebug\n*F\n+ 1 MatterhornChat.kt\ncom/intellij/ml/llm/matterhorn/llm/MatterhornChat\n*L\n265#1:341\n265#1:342,2\n270#1:344\n270#1:345,2\n271#1:349,4\n270#1:353\n274#1:354\n274#1:355,3\n275#1:358\n275#1:359,3\n265#1:362\n271#1:347\n271#1:348\n*E\n"})
/*     */ public final class MatterhornChat
/*     */ {
/*     */   @NotNull
/* 253 */   public static final Companion Companion = new Companion(null); @NotNull private final String system; @NotNull private final List<MatterhornChatElement> messages; @NotNull private final List<MatterhornTool> tools; @NotNull private final MatterhornToolChoice toolChoice; @Nullable private final String previousAnswerChoiceId; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[5]; arrayOfKSerializer1[0] = null; KClass[] arrayOfKClass2 = new KClass[4]; arrayOfKClass2[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass2[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass2[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass2[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer3 = new KSerializer[4]; arrayOfKSerializer3[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses.$serializer.INSTANCE; arrayOfKSerializer3[1] = (KSerializer)MatterhornChatMessage.$serializer.INSTANCE; arrayOfKSerializer3[2] = (KSerializer)MatterhornMultiPartChatMessage.$serializer.INSTANCE; arrayOfKSerializer3[3] = (KSerializer)MatterhornUserChatMessageWithToolResults.$serializer.INSTANCE; arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass2, arrayOfKSerializer3, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[2] = (KSerializer)new ArrayListSerializer((KSerializer)MatterhornTool.$serializer.INSTANCE); KClass[] arrayOfKClass1 = new KClass[3]; arrayOfKClass1[0] = Reflection.getOrCreateKotlinClass(MatterhornToolChoice.Any.class); arrayOfKClass1[1] = Reflection.getOrCreateKotlinClass(MatterhornToolChoice.Auto.class); arrayOfKClass1[2] = Reflection.getOrCreateKotlinClass(MatterhornToolChoice.Tool.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)MatterhornToolChoice.Any.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornToolChoice.Auto.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornToolChoice.Tool.$serializer.INSTANCE; arrayOfKSerializer1[3] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornToolChoice", Reflection.getOrCreateKotlinClass(MatterhornToolChoice.class), arrayOfKClass1, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); arrayOfKSerializer1[4] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<MatterhornChat> serializer() { return (KSerializer<MatterhornChat>)MatterhornChat.$serializer.INSTANCE; }
/*     */      }
/* 255 */   public MatterhornChat(@NotNull String system, @NotNull List<MatterhornChatElement> messages, @NotNull List<MatterhornTool> tools, @NotNull MatterhornToolChoice toolChoice, @Nullable String previousAnswerChoiceId) { this.system = system;
/* 256 */     this.messages = messages;
/* 257 */     this.tools = tools;
/* 258 */     this.toolChoice = toolChoice;
/* 259 */     this.previousAnswerChoiceId = previousAnswerChoiceId; } @NotNull public final String getSystem() { return this.system; } @NotNull public final List<MatterhornChatElement> getMessages() { return this.messages; } @Nullable public final String getPreviousAnswerChoiceId() { return this.previousAnswerChoiceId; }
/*     */   @NotNull public final List<MatterhornTool> getTools() { return this.tools; }
/* 261 */   @NotNull public final MatterhornToolChoice getToolChoice() { return this.toolChoice; } @NotNull public final MatterhornChat withNewMessage(@NotNull MatterhornChatElement message) { Intrinsics.checkNotNullParameter(message, "message"); return copy$default(this, null, CollectionsKt.plus(this.messages, message), null, null, null, 29, null); }
/*     */   
/*     */   @NotNull
/* 264 */   public final MatterhornChat replaceAll(@NotNull String oldValue, @NotNull String newValue, boolean ignoreCase) { Intrinsics.checkNotNullParameter(oldValue, "oldValue"); Intrinsics.checkNotNullParameter(newValue, "newValue"); String system = StringsKt.replace(this.system, oldValue, newValue, ignoreCase);
/* 265 */     Iterable<MatterhornChatElement> $this$map$iv = this.messages; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 341 */     Iterable<MatterhornChatElement> iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 342 */     for (MatterhornChatElement item$iv$iv : iterable1) {
/* 343 */       MatterhornChatElement matterhornChatElement1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-MatterhornChat$replaceAll$messages$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       MatterhornChatElement matterhornChatElement2 = matterhornChatElement1;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 362 */     List messages = (List)destination$iv$iv; return copy$default(this, system, messages, null, null, null, 28, null); } @NotNull public final MatterhornChat checkChatForAnthropic(@NotNull String separator) { Intrinsics.checkNotNullParameter(separator, "separator"); List<MatterhornChatMessage> newMessages = new ArrayList(); for (MatterhornChatElement message : this.messages) {
/* 363 */       CharSequence charSequence = ((MatterhornChatMessage)message).getContent(); int $i$a$-ifBlank-MatterhornChat$checkChatForAnthropic$content$1 = 0;
/*     */       String content = StringsKt.isBlank(charSequence) ? "<empty>" : (String)charSequence;
/*     */       Object object = CollectionsKt.lastOrNull(newMessages);
/*     */       (object instanceof MatterhornChatMessage) ? object : null;
/*     */       Intrinsics.checkNotNull(newMessages.removeLast(), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage");
/*     */       MatterhornChatMessage last = (MatterhornChatMessage)newMessages.removeLast();
/*     */       (message instanceof MatterhornChatMessage) ? ((((((object instanceof MatterhornChatMessage) ? object : null) != null) ? ((object instanceof MatterhornChatMessage) ? object : null).getKind() : null) == ((MatterhornChatMessage)message).getKind()) ? newMessages.add(new MatterhornChatMessage(last.getContent() + last.getContent() + separator, ((MatterhornChatMessage)message).getKind(), null, null, 12, null)) : newMessages.add(new MatterhornChatMessage(content, ((MatterhornChatMessage)message).getKind(), null, null, 12, null))) : newMessages.add(message);
/*     */     } 
/*     */     return copy$default(this, null, CollectionsKt.toList(newMessages), null, null, null, 29, null); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChat checkChatForOpenAI() {
/*     */     if (!this.tools.isEmpty())
/*     */       throw new InternalError("Tools are unsupported for OpenAI"); 
/*     */     for (MatterhornChatElement message : this.messages) {
/*     */       if (!(message instanceof MatterhornChatMessage))
/*     */         throw new InternalError("Tools are unsupported for OpenAI"); 
/*     */     } 
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.system;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<MatterhornChatElement> component2() {
/*     */     return this.messages;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<MatterhornTool> component3() {
/*     */     return this.tools;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornToolChoice component4() {
/*     */     return this.toolChoice;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component5() {
/*     */     return this.previousAnswerChoiceId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChat copy(@NotNull String system, @NotNull List<? extends MatterhornChatElement> messages, @NotNull List<MatterhornTool> tools, @NotNull MatterhornToolChoice toolChoice, @Nullable String previousAnswerChoiceId) {
/*     */     Intrinsics.checkNotNullParameter(system, "system");
/*     */     Intrinsics.checkNotNullParameter(messages, "messages");
/*     */     Intrinsics.checkNotNullParameter(tools, "tools");
/*     */     Intrinsics.checkNotNullParameter(toolChoice, "toolChoice");
/*     */     return new MatterhornChat(system, messages, tools, toolChoice, previousAnswerChoiceId);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MatterhornChat(system=" + this.system + ", messages=" + this.messages + ", tools=" + this.tools + ", toolChoice=" + this.toolChoice + ", previousAnswerChoiceId=" + this.previousAnswerChoiceId + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.system.hashCode();
/*     */     result = result * 31 + this.messages.hashCode();
/*     */     result = result * 31 + this.tools.hashCode();
/*     */     result = result * 31 + this.toolChoice.hashCode();
/*     */     return result * 31 + ((this.previousAnswerChoiceId == null) ? 0 : this.previousAnswerChoiceId.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MatterhornChat))
/*     */       return false; 
/*     */     MatterhornChat matterhornChat = (MatterhornChat)other;
/*     */     return !Intrinsics.areEqual(this.system, matterhornChat.system) ? false : (!Intrinsics.areEqual(this.messages, matterhornChat.messages) ? false : (!Intrinsics.areEqual(this.tools, matterhornChat.tools) ? false : (!Intrinsics.areEqual(this.toolChoice, matterhornChat.toolChoice) ? false : (!!Intrinsics.areEqual(this.previousAnswerChoiceId, matterhornChat.previousAnswerChoiceId)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */