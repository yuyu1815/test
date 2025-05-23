/*     */ package ai.grazie.auth.model.api;
/*     */ 
/*     */ import ai.grazie.license.JBALicense;
/*     */ import ai.grazie.license.JBALicense$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\017\022\b\020\004\032\004\030\0010\005¢\006\002\020\tJ\013\020\f\032\004\030\0010\005HÆ\003J\025\020\r\032\0020\0002\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;", "", "seen1", "", "license", "Lai/grazie/license/JBALicense;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/JBALicense;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/JBALicense;)V", "getLicense", "()Lai/grazie/license/JBALicense;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*     */ public final class Response
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final JBALicense license;
/*     */   
/*     */   public Response(@Nullable JBALicense license) {
/* 144 */     this.license = license; } @Nullable public final JBALicense getLicense() { return this.license; }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
/*     */   public static final class $serializer implements GeneratedSerializer<Response> {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */       arrayOfKSerializer[0] = BuiltinSerializersKt.getNullable((KSerializer)JBALicense$.serializer.INSTANCE);
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       JBALicense jBALicense = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         jBALicense = (JBALicense)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)JBALicense$.serializer.INSTANCE, jBALicense);
/*     */         i |= 0x1;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               jBALicense = (JBALicense)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)JBALicense$.serializer.INSTANCE, jBALicense);
/*     */               i |= 0x1;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response(i, jBALicense, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response", INSTANCE, 1);
/*     */       pluginGeneratedSerialDescriptor.addElement("license", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;", "auth-model"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response> serializer() {
/*     */       return (KSerializer<AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response>)AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final JBALicense component1() {
/*     */     return this.license;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Response copy(@Nullable JBALicense license) {
/*     */     return new Response(license);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Response(license=" + this.license + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return (this.license == null) ? 0 : this.license.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Response))
/*     */       return false; 
/*     */     Response response = (Response)other;
/*     */     return !!Intrinsics.areEqual(this.license, response.license);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */