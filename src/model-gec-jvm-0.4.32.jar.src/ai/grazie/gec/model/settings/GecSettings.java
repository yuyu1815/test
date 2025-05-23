/*    */ package ai.grazie.gec.model.settings;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/gec/model/settings/GecSettings;", "", "seen1", "", "userSettings", "Lai/grazie/gec/model/settings/UserSettings;", "defaults", "Lai/grazie/gec/model/settings/SettingStructure;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/settings/UserSettings;Lai/grazie/gec/model/settings/SettingStructure;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/settings/UserSettings;Lai/grazie/gec/model/settings/SettingStructure;)V", "getDefaults", "()Lai/grazie/gec/model/settings/SettingStructure;", "getUserSettings", "()Lai/grazie/gec/model/settings/UserSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*    */ public final class GecSettings {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  9 */   public GecSettings(@NotNull UserSettings userSettings, @NotNull SettingStructure defaults) { this.userSettings = userSettings;
/* 10 */     this.defaults = defaults; } @NotNull private final UserSettings userSettings; @NotNull private final SettingStructure defaults; @NotNull public final SettingStructure getDefaults() { return this.defaults; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/GecSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/GecSettings;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */   public static final class $serializer implements GeneratedSerializer<GecSettings> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)UserSettings.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)SettingStructure.$serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public GecSettings deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       UserSettings userSettings = null;
/*    */       SettingStructure settingStructure = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         userSettings = (UserSettings)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UserSettings.$serializer.INSTANCE, userSettings);
/*    */         i |= 0x1;
/*    */         settingStructure = (SettingStructure)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)SettingStructure.$serializer.INSTANCE, settingStructure);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               userSettings = (UserSettings)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UserSettings.$serializer.INSTANCE, userSettings);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               settingStructure = (SettingStructure)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)SettingStructure.$serializer.INSTANCE, settingStructure);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new GecSettings(i, userSettings, settingStructure, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull GecSettings value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       GecSettings.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.GecSettings", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("userSettings", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("defaults", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/settings/GecSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/settings/GecSettings;", "model-gec"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GecSettings> serializer() {
/*    */       return (KSerializer<GecSettings>)GecSettings.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UserSettings getUserSettings() {
/*    */     return this.userSettings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UserSettings component1() {
/*    */     return this.userSettings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SettingStructure component2() {
/*    */     return this.defaults;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GecSettings copy(@NotNull UserSettings userSettings, @NotNull SettingStructure defaults) {
/*    */     Intrinsics.checkNotNullParameter(userSettings, "userSettings");
/*    */     Intrinsics.checkNotNullParameter(defaults, "defaults");
/*    */     return new GecSettings(userSettings, defaults);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GecSettings(userSettings=" + this.userSettings + ", defaults=" + this.defaults + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.userSettings.hashCode();
/*    */     return result * 31 + this.defaults.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GecSettings))
/*    */       return false; 
/*    */     GecSettings gecSettings = (GecSettings)other;
/*    */     return !Intrinsics.areEqual(this.userSettings, gecSettings.userSettings) ? false : (!!Intrinsics.areEqual(this.defaults, gecSettings.defaults));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\settings\GecSettings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */