/*     */ package ai.grazie.qa;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000  2\0020\001:\002\037 B+\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003¢\006\002\020\nJ\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\003HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\003HÖ\001J\t\020\026\032\0020\005HÖ\001J&\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035HÁ\001¢\006\002\b\036R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006!"}, d2 = {"Lai/grazie/qa/PrioritizedSource;", "", "seen1", "", "name", "", "priority", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getPriority", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_qa", "$serializer", "Companion", "model-qa"})
/*     */ public final class PrioritizedSource
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String name;
/*     */   private final int priority;
/*     */   
/*     */   public PrioritizedSource(@NotNull String name, int priority) {
/* 110 */     this.name = name;
/* 111 */     this.priority = priority; } public final int getPriority() { return this.priority; }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/PrioritizedSource.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/PrioritizedSource;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"})
/*     */   public static final class $serializer implements GeneratedSerializer<PrioritizedSource> {
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
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public PrioritizedSource deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       String str = null;
/*     */       int j = 0;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */         i |= 0x1;
/*     */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*     */         i |= 0x2;
/*     */       } else {
/*     */         while (bool) {
/*     */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (k) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(k);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new PrioritizedSource(i, str, j, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull PrioritizedSource value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       PrioritizedSource.write$Self$model_qa(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.PrioritizedSource", INSTANCE, 2);
/*     */       pluginGeneratedSerialDescriptor.addElement("name", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("priority", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/PrioritizedSource$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/PrioritizedSource;", "model-qa"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<PrioritizedSource> serializer() {
/*     */       return (KSerializer<PrioritizedSource>)PrioritizedSource.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   public final int component2() {
/*     */     return this.priority;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PrioritizedSource copy(@NotNull String name, int priority) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     return new PrioritizedSource(name, priority);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "PrioritizedSource(name=" + this.name + ", priority=" + this.priority + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     return result * 31 + Integer.hashCode(this.priority);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof PrioritizedSource))
/*     */       return false; 
/*     */     PrioritizedSource prioritizedSource = (PrioritizedSource)other;
/*     */     return !Intrinsics.areEqual(this.name, prioritizedSource.name) ? false : (!(this.priority != prioritizedSource.priority));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\PrioritizedSource.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */