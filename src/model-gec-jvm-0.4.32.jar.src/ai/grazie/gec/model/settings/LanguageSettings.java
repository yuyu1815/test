/*    */ package ai.grazie.gec.model.settings;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 02\0020\001:\003/01B=\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\016\020\b\032\n\022\004\022\0020\n\030\0010\t\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\016J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\007HÆ\003J\024\020\037\032\b\022\004\022\0020\n0\tHÆ\003¢\006\002\020\027J2\020 \032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001¢\006\002\020!J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001H\002J\b\020%\032\0020\003H\026J\t\020&\032\0020\007HÖ\001J&\020'\032\0020(2\006\020)\032\0020\0002\006\020*\032\0020+2\006\020,\032\0020-HÁ\001¢\006\002\b.R\035\020\017\032\b\022\004\022\0020\0210\0208F¢\006\f\022\004\b\022\020\023\032\004\b\024\020\025R\031\020\b\032\b\022\004\022\0020\n0\t¢\006\n\n\002\020\030\032\004\b\026\020\027R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\032R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\033\020\034¨\0062"}, d2 = {"Lai/grazie/gec/model/settings/LanguageSettings;", "", "seen1", "", "language", "Lai/grazie/nlp/langs/Language;", "ruleDescriptionLinkText", "", "groups", "", "Lai/grazie/gec/model/settings/LanguageSettings$Group;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/lang/String;[Lai/grazie/gec/model/settings/LanguageSettings$Group;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;[Lai/grazie/gec/model/settings/LanguageSettings$Group;)V", "flattenedSettings", "", "Lai/grazie/gec/model/settings/Setting;", "getFlattenedSettings$annotations", "()V", "getFlattenedSettings", "()Ljava/util/List;", "getGroups", "()[Lai/grazie/gec/model/settings/LanguageSettings$Group;", "[Lai/grazie/gec/model/settings/LanguageSettings$Group;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getRuleDescriptionLinkText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;[Lai/grazie/gec/model/settings/LanguageSettings$Group;)Lai/grazie/gec/model/settings/LanguageSettings;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "Group", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nLanguageSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSettings.kt\nai/grazie/gec/model/settings/LanguageSettings\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1368#2:58\n1454#2,5:59\n1368#2:64\n1454#2,5:65\n*S KotlinDebug\n*F\n+ 1 LanguageSettings.kt\nai/grazie/gec/model/settings/LanguageSettings\n*L\n21#1:58\n21#1:59,5\n22#1:64\n22#1:65,5\n*E\n"})
/*    */ public final class LanguageSettings {
/*    */   @NotNull
/*  8 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull private final Language language; @NotNull private final String ruleDescriptionLinkText; @NotNull private final Group[] groups; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Group.class), (KSerializer)Group.$serializer.INSTANCE);
/* 11 */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public LanguageSettings(@NotNull Language language, @NotNull String ruleDescriptionLinkText, @NotNull Group[] groups) { this.language = language;
/*    */     
/* 13 */     this.ruleDescriptionLinkText = ruleDescriptionLinkText;
/* 14 */     this.groups = groups; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/LanguageSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/LanguageSettings;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<LanguageSettings> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LanguageSettings.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LanguageSettings deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Language language = null; String str = null; LanguageSettings.Group[] arrayOfGroup = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LanguageSettings.$childSerializers; if (compositeDecoder.decodeSequentially()) { language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; arrayOfGroup = (LanguageSettings.Group[])compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfGroup); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: arrayOfGroup = (LanguageSettings.Group[])compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfGroup); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LanguageSettings(i, language, str, arrayOfGroup, null); } public void serialize(@NotNull Encoder encoder, @NotNull LanguageSettings value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LanguageSettings.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.LanguageSettings", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("ruleDescriptionLinkText", false); pluginGeneratedSerialDescriptor.addElement("groups", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final Group[] getGroups() { return this.groups; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/settings/LanguageSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/settings/LanguageSettings;", "model-gec"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<LanguageSettings> serializer() { return (KSerializer<LanguageSettings>)LanguageSettings.$serializer.INSTANCE; } }
/*    */   @NotNull public final Language getLanguage() { return this.language; }
/*    */   @NotNull
/*    */   public final String getRuleDescriptionLinkText() { return this.ruleDescriptionLinkText; }
/*    */   @NotNull
/* 20 */   public final List<Setting> getFlattenedSettings() { List list1 = ArraysKt.toList((Object[])this.groups);
/* 21 */     int $i$f$flatMap = 0;
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
/* 58 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 59 */     for (Object element$iv$iv : list2) {
/* 60 */       Group it = (Group)element$iv$iv; int $i$a$-flatMap-LanguageSettings$flattenedSettings$1 = 0; Iterable list$iv$iv = ArraysKt.toList((Object[])it.getSettings());
/* 61 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 63 */     Iterable $this$flatMap$iv = destination$iv$iv; $i$f$flatMap = 0;
/* 64 */     Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv; destination$iv$iv = new ArrayList(); $i$f$flatMapTo = 0;
/* 65 */     for (Object element$iv$iv : $this$flatMapTo$iv$iv) {
/* 66 */       Setting it = (Setting)element$iv$iv; int $i$a$-flatMap-LanguageSettings$flattenedSettings$2 = 0;
/*    */     } 
/*    */     
/* 69 */     return (List<Setting>)destination$iv$iv; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LanguageSettings))
/*    */       return false; 
/*    */     if (this.language != ((LanguageSettings)other).language)
/*    */       return false; 
/*    */     return Arrays.equals((Object[])this.groups, (Object[])((LanguageSettings)other).groups);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = this.language.hashCode();
/*    */     result = 31 * result + Arrays.hashCode((Object[])this.groups);
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.ruleDescriptionLinkText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Group[] component3() {
/*    */     return this.groups;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LanguageSettings copy(@NotNull Language language, @NotNull String ruleDescriptionLinkText, @NotNull Group[] groups) {
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(ruleDescriptionLinkText, "ruleDescriptionLinkText");
/*    */     Intrinsics.checkNotNullParameter(groups, "groups");
/*    */     return new LanguageSettings(language, ruleDescriptionLinkText, groups);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LanguageSettings(language=" + this.language + ", ruleDescriptionLinkText=" + this.ruleDescriptionLinkText + ", groups=" + Arrays.toString((Object[])this.groups) + ")";
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\024\020\023\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\020J(\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\003H\026J\t\020\032\032\0020\005HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\021\032\004\b\017\020\020¨\006%"}, d2 = {"Lai/grazie/gec/model/settings/LanguageSettings$Group;", "", "seen1", "", "displayName", "", "settings", "", "Lai/grazie/gec/model/settings/Setting;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/gec/model/settings/Setting;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/gec/model/settings/Setting;)V", "getDisplayName", "()Ljava/lang/String;", "getSettings", "()[Lai/grazie/gec/model/settings/Setting;", "[Lai/grazie/gec/model/settings/Setting;", "component1", "component2", "copy", "(Ljava/lang/String;[Lai/grazie/gec/model/settings/Setting;)Lai/grazie/gec/model/settings/LanguageSettings$Group;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*    */   public static final class Group {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final String displayName;
/*    */     @NotNull
/*    */     private final Setting[] settings;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Group(@NotNull String displayName, @NotNull Setting[] settings) {
/*    */       this.displayName = displayName;
/*    */       this.settings = settings;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = null;
/*    */       arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Setting.class), Setting.Companion.serializer());
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/LanguageSettings.Group.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/LanguageSettings$Group;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */     public static final class $serializer implements GeneratedSerializer<Group> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])LanguageSettings.Group.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */         arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public LanguageSettings.Group deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         String str = null;
/*    */         Setting[] arrayOfSetting = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])LanguageSettings.Group.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */           i |= 0x1;
/*    */           arrayOfSetting = (Setting[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfSetting);
/*    */           i |= 0x2;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 arrayOfSetting = (Setting[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfSetting);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new LanguageSettings.Group(i, str, arrayOfSetting, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull LanguageSettings.Group value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         LanguageSettings.Group.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.LanguageSettings.Group", INSTANCE, 2);
/*    */         pluginGeneratedSerialDescriptor.addElement("displayName", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("settings", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/settings/LanguageSettings$Group$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/settings/LanguageSettings$Group;", "model-gec"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<LanguageSettings.Group> serializer() {
/*    */         return (KSerializer<LanguageSettings.Group>)LanguageSettings.Group.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getDisplayName() {
/*    */       return this.displayName;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Setting[] getSettings() {
/*    */       return this.settings;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Group))
/*    */         return false; 
/*    */       if (!Intrinsics.areEqual(this.displayName, ((Group)other).displayName))
/*    */         return false; 
/*    */       return Arrays.equals((Object[])this.settings, (Object[])((Group)other).settings);
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       int result = this.displayName.hashCode();
/*    */       result = 31 * result + Arrays.hashCode((Object[])this.settings);
/*    */       return result;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.displayName;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Setting[] component2() {
/*    */       return this.settings;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Group copy(@NotNull String displayName, @NotNull Setting[] settings) {
/*    */       Intrinsics.checkNotNullParameter(displayName, "displayName");
/*    */       Intrinsics.checkNotNullParameter(settings, "settings");
/*    */       return new Group(displayName, settings);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Group(displayName=" + this.displayName + ", settings=" + Arrays.toString((Object[])this.settings) + ")";
/*    */     }
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/LanguageSettings.Group.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/LanguageSettings$Group;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */   public static final class $serializer implements GeneratedSerializer<Group> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])LanguageSettings.Group.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public LanguageSettings.Group deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       Setting[] arrayOfSetting = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])LanguageSettings.Group.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         arrayOfSetting = (Setting[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfSetting);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               arrayOfSetting = (Setting[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfSetting);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new LanguageSettings.Group(i, str, arrayOfSetting, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull LanguageSettings.Group value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       LanguageSettings.Group.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.LanguageSettings.Group", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("displayName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("settings", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\settings\LanguageSettings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */