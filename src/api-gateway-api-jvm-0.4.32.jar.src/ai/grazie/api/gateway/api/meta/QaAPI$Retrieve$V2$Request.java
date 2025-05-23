/*    */ package ai.grazie.api.gateway.api.meta;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.qa.PrioritizedSource;
/*    */ import ai.grazie.qa.PrioritizedSource$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
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
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201B_\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\024\020\b\032\020\022\n\022\b\022\004\022\0020\n0\t\030\0010\t\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\005\022\b\020\016\032\004\030\0010\017¢\006\002\020\020BI\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\005\022\022\020\b\032\016\022\n\022\b\022\004\022\0020\n0\t0\t\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\005¢\006\002\020\021J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\005HÆ\003J\025\020\037\032\016\022\n\022\b\022\004\022\0020\n0\t0\tHÆ\003J\013\020 \032\004\030\0010\fHÆ\003J\013\020!\032\004\030\0010\005HÆ\003JU\020\"\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0052\024\b\002\020\b\032\016\022\n\022\b\022\004\022\0020\n0\t0\t2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\005HÆ\001J\023\020#\032\0020$2\b\020%\032\004\030\0010\001HÖ\003J\t\020&\032\0020\003HÖ\001J\t\020'\032\0020\005HÖ\001J&\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÁ\001¢\006\002\b/R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\r\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\023R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\025\020\026R\035\020\b\032\016\022\n\022\b\022\004\022\0020\n0\t0\t¢\006\b\n\000\032\004\b\027\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\023R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\032\020\033¨\0062"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "", "seen1", "", "query", "", "size", "config", "prioritizedSources", "", "Lai/grazie/qa/PrioritizedSource;", "llmProfile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getContext", "getLlmProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrioritizedSources", "()Ljava/util/List;", "getQuery", "getSize", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */ {
/*    */   @NotNull
/*    */   private final String query;
/*    */   private final int size;
/*    */   @NotNull
/*    */   private final String config;
/*    */   @NotNull
/*    */   private final List<List<PrioritizedSource>> prioritizedSources;
/*    */   @Nullable
/*    */   private final LLMProfileID llmProfile;
/*    */   @Nullable
/*    */   private final String context;
/*    */   @NotNull
/* 58 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/* 60 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull String query, int size, @NotNull String config, @NotNull List<List<PrioritizedSource>> prioritizedSources, @Nullable LLMProfileID llmProfile, @Nullable String context) { this.query = query;
/* 61 */     this.size = size;
/* 62 */     this.config = config;
/* 63 */     this.prioritizedSources = prioritizedSources;
/* 64 */     this.llmProfile = llmProfile;
/* 65 */     this.context = context; } @Nullable public final String getContext() { return this.context; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)new ArrayListSerializer((KSerializer)PrioritizedSource$.serializer.INSTANCE));
/*    */     arrayOfKSerializer[4] = null;
/*    */     arrayOfKSerializer[5] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */   public static final class $serializer implements GeneratedSerializer<Request> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.Retrieve.V2.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[6];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = arrayOfKSerializer1[3];
/*    */       arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)LLMProfileID.Serializer.INSTANCE);
/*    */       arrayOfKSerializer2[5] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public QaAPI.Retrieve.V2.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null;
/*    */       int j = 0;
/*    */       String str2 = null;
/*    */       List list = null;
/*    */       LLMProfileID lLMProfileID = null;
/*    */       String str3 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.Retrieve.V2.Request.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list);
/*    */         i |= 0x8;
/*    */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */         i |= 0x10;
/*    */         str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new QaAPI.Retrieve.V2.Request(i, str1, j, str2, list, lLMProfileID, str3, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V2.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       QaAPI.Retrieve.V2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V2.Request", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("query", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("size", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("config", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("prioritizedSources", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("llmProfile", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("context", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<QaAPI.Retrieve.V2.Request> serializer() {
/*    */       return (KSerializer<QaAPI.Retrieve.V2.Request>)QaAPI.Retrieve.V2.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getQuery() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   public final int getSize() {
/*    */     return this.size;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getConfig() {
/*    */     return this.config;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<List<PrioritizedSource>> getPrioritizedSources() {
/*    */     return this.prioritizedSources;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LLMProfileID getLlmProfile() {
/*    */     return this.llmProfile;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.size;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.config;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<List<PrioritizedSource>> component4() {
/*    */     return this.prioritizedSources;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LLMProfileID component5() {
/*    */     return this.llmProfile;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component6() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull String query, int size, @NotNull String config, @NotNull List<? extends List<PrioritizedSource>> prioritizedSources, @Nullable LLMProfileID llmProfile, @Nullable String context) {
/*    */     Intrinsics.checkNotNullParameter(query, "query");
/*    */     Intrinsics.checkNotNullParameter(config, "config");
/*    */     Intrinsics.checkNotNullParameter(prioritizedSources, "prioritizedSources");
/*    */     return new Request(query, size, config, prioritizedSources, llmProfile, context);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(query=" + this.query + ", size=" + this.size + ", config=" + this.config + ", prioritizedSources=" + this.prioritizedSources + ", llmProfile=" + this.llmProfile + ", context=" + this.context + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.query.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.size);
/*    */     result = result * 31 + this.config.hashCode();
/*    */     result = result * 31 + this.prioritizedSources.hashCode();
/*    */     result = result * 31 + ((this.llmProfile == null) ? 0 : this.llmProfile.hashCode());
/*    */     return result * 31 + ((this.context == null) ? 0 : this.context.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.query, request.query) ? false : ((this.size != request.size) ? false : (!Intrinsics.areEqual(this.config, request.config) ? false : (!Intrinsics.areEqual(this.prioritizedSources, request.prioritizedSources) ? false : (!Intrinsics.areEqual(this.llmProfile, request.llmProfile) ? false : (!!Intrinsics.areEqual(this.context, request.context))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\QaAPI$Retrieve$V2$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */