/*    */ package ai.grazie.user.cfg.model.utils;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B9\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\n\020\007\032\0060\003j\002`\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B'\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005\022\f\b\002\020\007\032\0060\003j\002`\b¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\013\020\023\032\004\030\0010\005HÆ\003J\r\020\024\032\0060\003j\002`\bHÆ\003J-\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\f\b\002\020\007\032\0060\003j\002`\bHÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\033HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\025\020\007\032\0060\003j\002`\b¢\006\b\n\000\032\004\b\017\020\020R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\021\020\016¨\006&"}, d2 = {"Lai/grazie/user/cfg/model/utils/Shortcut;", "", "seen1", "", "firstStroke", "Lai/grazie/user/cfg/model/utils/Keystroke;", "secondStroke", "os", "Lai/grazie/user/cfg/model/utils/OS;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/user/cfg/model/utils/Keystroke;Lai/grazie/user/cfg/model/utils/Keystroke;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/user/cfg/model/utils/Keystroke;Lai/grazie/user/cfg/model/utils/Keystroke;I)V", "getFirstStroke", "()Lai/grazie/user/cfg/model/utils/Keystroke;", "getOs", "()I", "getSecondStroke", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_cfg_model", "$serializer", "Companion", "user-cfg-model"})
/*    */ public final class Shortcut
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Keystroke firstStroke;
/*    */   @Nullable
/*    */   private final Keystroke secondStroke;
/*    */   private final int os;
/*    */   
/*    */   public Shortcut(@NotNull Keystroke firstStroke, @Nullable Keystroke secondStroke, int os) {
/* 53 */     this.firstStroke = firstStroke;
/* 54 */     this.secondStroke = secondStroke;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     this.os = os; } public final int getOs() { return this.os; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/cfg/model/utils/Shortcut.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/cfg/model/utils/Shortcut;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-cfg-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<Shortcut> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = (KSerializer)Keystroke.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)Keystroke.$serializer.INSTANCE);
/*    */       arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Shortcut deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Keystroke keystroke1 = null, keystroke2 = null;
/*    */       int j = 0;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         keystroke1 = (Keystroke)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Keystroke.$serializer.INSTANCE, keystroke1);
/*    */         i |= 0x1;
/*    */         keystroke2 = (Keystroke)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Keystroke.$serializer.INSTANCE, keystroke2);
/*    */         i |= 0x2;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               keystroke1 = (Keystroke)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Keystroke.$serializer.INSTANCE, keystroke1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               keystroke2 = (Keystroke)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Keystroke.$serializer.INSTANCE, keystroke2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Shortcut(i, keystroke1, keystroke2, j, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Shortcut value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Shortcut.write$Self$user_cfg_model(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.cfg.model.utils.Shortcut", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("firstStroke", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("secondStroke", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("os", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/cfg/model/utils/Shortcut$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/cfg/model/utils/Shortcut;", "user-cfg-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Shortcut> serializer() {
/*    */       return (KSerializer<Shortcut>)Shortcut.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Keystroke getFirstStroke() {
/*    */     return this.firstStroke;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Keystroke getSecondStroke() {
/*    */     return this.secondStroke;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Keystroke component1() {
/*    */     return this.firstStroke;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Keystroke component2() {
/*    */     return this.secondStroke;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.os;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Shortcut copy(@NotNull Keystroke firstStroke, @Nullable Keystroke secondStroke, int os) {
/*    */     Intrinsics.checkNotNullParameter(firstStroke, "firstStroke");
/*    */     return new Shortcut(firstStroke, secondStroke, os);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Shortcut(firstStroke=" + this.firstStroke + ", secondStroke=" + this.secondStroke + ", os=" + this.os + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.firstStroke.hashCode();
/*    */     result = result * 31 + ((this.secondStroke == null) ? 0 : this.secondStroke.hashCode());
/*    */     return result * 31 + Integer.hashCode(this.os);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Shortcut))
/*    */       return false; 
/*    */     Shortcut shortcut = (Shortcut)other;
/*    */     return !Intrinsics.areEqual(this.firstStroke, shortcut.firstStroke) ? false : (!Intrinsics.areEqual(this.secondStroke, shortcut.secondStroke) ? false : (!(this.os != shortcut.os)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\mode\\utils\Shortcut.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */