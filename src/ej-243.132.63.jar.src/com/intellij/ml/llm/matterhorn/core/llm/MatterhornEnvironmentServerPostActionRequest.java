/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIResponse;
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIResponse$;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B\037\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\013\020\024\032\004\030\0010\003HÆ\003J\013\020\025\032\004\030\0010\005HÆ\003J!\020\026\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\tHÖ\001J\t\020\033\032\0020\005HÖ\001J%\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"H\001¢\006\002\b#R\036\020\002\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\036\020\004\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;", "", "chatCompletion", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;", "error", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChatCompletion$annotations", "()V", "getChatCompletion", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;", "getError$annotations", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class MatterhornEnvironmentServerPostActionRequest {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Nullable
/*    */   private final OpenAIResponse chatCompletion;
/*    */   @Nullable
/*    */   private final String error;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornEnvironmentServerPostActionRequest;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<MatterhornEnvironmentServerPostActionRequest> serializer() {
/* 34 */       return (KSerializer<MatterhornEnvironmentServerPostActionRequest>)MatterhornEnvironmentServerPostActionRequest.$serializer.INSTANCE;
/*    */     } private Companion() {} }
/*    */   public MatterhornEnvironmentServerPostActionRequest(@Nullable OpenAIResponse chatCompletion, @Nullable String error) {
/* 37 */     this.chatCompletion = chatCompletion;
/*    */     
/* 39 */     this.error = error; } @Nullable public final OpenAIResponse getChatCompletion() { return this.chatCompletion; } @Nullable public final String getError() { return this.error; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final OpenAIResponse component1() {
/*    */     return this.chatCompletion;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.error;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornEnvironmentServerPostActionRequest copy(@Nullable OpenAIResponse chatCompletion, @Nullable String error) {
/*    */     return new MatterhornEnvironmentServerPostActionRequest(chatCompletion, error);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MatterhornEnvironmentServerPostActionRequest(chatCompletion=" + this.chatCompletion + ", error=" + this.error + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.chatCompletion == null) ? 0 : this.chatCompletion.hashCode();
/*    */     return result * 31 + ((this.error == null) ? 0 : this.error.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MatterhornEnvironmentServerPostActionRequest))
/*    */       return false; 
/*    */     MatterhornEnvironmentServerPostActionRequest matterhornEnvironmentServerPostActionRequest = (MatterhornEnvironmentServerPostActionRequest)other;
/*    */     return !Intrinsics.areEqual(this.chatCompletion, matterhornEnvironmentServerPostActionRequest.chatCompletion) ? false : (!!Intrinsics.areEqual(this.error, matterhornEnvironmentServerPostActionRequest.error));
/*    */   }
/*    */   
/*    */   public MatterhornEnvironmentServerPostActionRequest() {
/*    */     this((OpenAIResponse)null, (String)null, 3, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornEnvironmentServerPostActionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */