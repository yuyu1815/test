/*    */ package ai.grazie.user.cfg.model.utils;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\023\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*BO\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\n\020\006\032\0060\003j\002`\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\006\020\013\032\0020\t\022\006\020\f\032\0020\t\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B\033\022\006\020\004\032\0020\005\022\f\b\002\020\006\032\0060\003j\002`\007¢\006\002\020\020J\t\020\032\032\0020\005HÆ\003J\r\020\033\032\0060\003j\002`\007HÆ\003J!\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\f\b\002\020\006\032\0060\003j\002`\007HÆ\001J\023\020\035\032\0020\t2\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\003HÖ\001J\t\020 \032\0020\005HÖ\001J&\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'HÁ\001¢\006\002\b(R\021\020\013\032\0020\t¢\006\b\n\000\032\004\b\021\020\022R\021\020\n\032\0020\t¢\006\b\n\000\032\004\b\023\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\f\032\0020\t¢\006\b\n\000\032\004\b\026\020\022R\025\020\006\032\0060\003j\002`\007¢\006\b\n\000\032\004\b\027\020\030R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\031\020\022¨\006+"}, d2 = {"Lai/grazie/user/cfg/model/utils/Keystroke;", "", "seen1", "", "key", "", "modifiers", "Lai/grazie/user/cfg/model/utils/Modifier;", "shift", "", "ctrl", "alt", "meta", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;I)V", "getAlt", "()Z", "getCtrl", "getKey", "()Ljava/lang/String;", "getMeta", "getModifiers", "()I", "getShift", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_cfg_model", "$serializer", "Companion", "user-cfg-model"})
/*    */ public final class Keystroke {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String key;
/*    */   private final int modifiers;
/*    */   
/* 35 */   public Keystroke(@NotNull String key, int modifiers) { this.key = key;
/* 36 */     this.modifiers = modifiers;
/*    */     
/* 38 */     this.shift = ((this.modifiers & 0x2) == 2);
/*    */     
/* 40 */     this.ctrl = ((this.modifiers & 0x4) == 4);
/*    */     
/* 42 */     this.alt = ((this.modifiers & 0x8) == 8);
/*    */     
/* 44 */     this.meta = ((this.modifiers & 0x10) == 16); } private final boolean shift; private final boolean ctrl; private final boolean alt; private final boolean meta; public final boolean getMeta() { return this.meta; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/cfg/model/utils/Keystroke.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/cfg/model/utils/Keystroke;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-cfg-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<Keystroke> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[5] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Keystroke deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       int j = 0;
/*    */       boolean bool1 = false, bool2 = false, bool3 = false, bool4 = false;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */         bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Keystroke(i, str, j, bool1, bool2, bool3, bool4, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Keystroke value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Keystroke.write$Self$user_cfg_model(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.cfg.model.utils.Keystroke", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("key", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("modifiers", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("shift", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("ctrl", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("alt", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("meta", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/cfg/model/utils/Keystroke$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/cfg/model/utils/Keystroke;", "user-cfg-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Keystroke> serializer() {
/*    */       return (KSerializer<Keystroke>)Keystroke.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getKey() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   public final int getModifiers() {
/*    */     return this.modifiers;
/*    */   }
/*    */   
/*    */   public final boolean getShift() {
/*    */     return this.shift;
/*    */   }
/*    */   
/*    */   public final boolean getCtrl() {
/*    */     return this.ctrl;
/*    */   }
/*    */   
/*    */   public final boolean getAlt() {
/*    */     return this.alt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.modifiers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Keystroke copy(@NotNull String key, int modifiers) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return new Keystroke(key, modifiers);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Keystroke(key=" + this.key + ", modifiers=" + this.modifiers + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.key.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.modifiers);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Keystroke))
/*    */       return false; 
/*    */     Keystroke keystroke = (Keystroke)other;
/*    */     return !Intrinsics.areEqual(this.key, keystroke.key) ? false : (!(this.modifiers != keystroke.modifiers));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\mode\\utils\Keystroke.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */