/*    */ package ai.grazie.gec.model.settings;
/*    */ 
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\020\013\n\002\b\n\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B!\022\n\b\002\020\004\032\004\030\0010\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\013\020\022\032\004\030\0010\005HÆ\003J\024\020\023\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\020J*\020\024\032\0020\0002\n\b\002\020\004\032\004\030\0010\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001¢\006\002\020\025J\016\020\026\032\0020\0002\006\020\027\032\0020\030J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001H\002J\035\020\034\032\004\030\0010\b2\016\b\002\020\035\032\b\022\004\022\0020\b0\007¢\006\002\020\036J\020\020\037\032\004\030\0010\b2\006\020 \032\0020\005J\b\020!\032\0020\003H\026J\006\020\"\032\0020\032J\t\020#\032\0020\005HÖ\001J&\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*HÁ\001¢\006\002\b+R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\r\020\016R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\021\032\004\b\017\020\020¨\006."}, d2 = {"Lai/grazie/gec/model/settings/UserSettings;", "", "seen1", "", "activeProfileId", "", "customProfiles", "", "Lai/grazie/gec/model/settings/StyleProfile;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/gec/model/settings/StyleProfile;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/gec/model/settings/StyleProfile;)V", "getActiveProfileId", "()Ljava/lang/String;", "getCustomProfiles", "()[Lai/grazie/gec/model/settings/StyleProfile;", "[Lai/grazie/gec/model/settings/StyleProfile;", "component1", "component2", "copy", "(Ljava/lang/String;[Lai/grazie/gec/model/settings/StyleProfile;)Lai/grazie/gec/model/settings/UserSettings;", "dropDefaults", "defaults", "Lai/grazie/gec/model/settings/SettingStructure;", "equals", "", "other", "findActiveProfile", "defaultProfiles", "([Lai/grazie/gec/model/settings/StyleProfile;)Lai/grazie/gec/model/settings/StyleProfile;", "findProfile", "id", "hashCode", "isEmpty", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nUserSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSettings.kt\nai/grazie/gec/model/settings/UserSettings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,56:1\n1310#2,2:57\n1310#2,2:59\n10065#2:61\n10487#2,5:62\n8634#2,2:73\n8894#2,4:75\n11476#2,9:79\n13402#2:88\n13403#2:90\n11485#2:91\n1202#3,2:67\n1230#3,4:69\n1#4:89\n1#4:96\n37#5:92\n36#5,3:93\n*S KotlinDebug\n*F\n+ 1 UserSettings.kt\nai/grazie/gec/model/settings/UserSettings\n*L\n15#1:57,2\n18#1:59,2\n37#1:61\n37#1:62,5\n39#1:73,2\n39#1:75,4\n41#1:79,9\n41#1:88\n41#1:90\n41#1:91\n37#1:67,2\n37#1:69,4\n41#1:89\n47#1:92\n47#1:93,3\n*E\n"})
/*    */ public final class UserSettings {
/*  9 */   public UserSettings(@Nullable String activeProfileId, @NotNull StyleProfile[] customProfiles) { this.activeProfileId = activeProfileId;
/* 10 */     this.customProfiles = customProfiles; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/UserSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/UserSettings;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<UserSettings> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])UserSettings.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public UserSettings deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; StyleProfile[] arrayOfStyleProfile = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])UserSettings.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x1; arrayOfStyleProfile = (StyleProfile[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfStyleProfile); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x1; continue;case 1: arrayOfStyleProfile = (StyleProfile[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfStyleProfile); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new UserSettings(i, str, arrayOfStyleProfile, null); } public void serialize(@NotNull Encoder encoder, @NotNull UserSettings value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); UserSettings.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.UserSettings", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("activeProfileId", true); pluginGeneratedSerialDescriptor.addElement("customProfiles", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final StyleProfile[] getCustomProfiles() { return this.customProfiles; }
/*    */    @Nullable
/*    */   public final String getActiveProfileId() {
/*    */     return this.activeProfileId;
/*    */   } @Nullable
/*    */   public final StyleProfile findActiveProfile(@NotNull StyleProfile[] defaultProfiles) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'defaultProfiles'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield activeProfileId : Ljava/lang/String;
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 21
/*    */     //   14: pop
/*    */     //   15: getstatic ai/grazie/gec/model/settings/SettingStructure.Companion : Lai/grazie/gec/model/settings/SettingStructure$Companion;
/*    */     //   18: invokevirtual defaultProfileId : ()Ljava/lang/String;
/*    */     //   21: astore_2
/*    */     //   22: aload_0
/*    */     //   23: aload_2
/*    */     //   24: invokevirtual findProfile : (Ljava/lang/String;)Lai/grazie/gec/model/settings/StyleProfile;
/*    */     //   27: dup
/*    */     //   28: ifnonnull -> 88
/*    */     //   31: pop
/*    */     //   32: aload_1
/*    */     //   33: astore_3
/*    */     //   34: iconst_0
/*    */     //   35: istore #4
/*    */     //   37: iconst_0
/*    */     //   38: istore #5
/*    */     //   40: aload_3
/*    */     //   41: arraylength
/*    */     //   42: istore #6
/*    */     //   44: iload #5
/*    */     //   46: iload #6
/*    */     //   48: if_icmpge -> 87
/*    */     //   51: aload_3
/*    */     //   52: iload #5
/*    */     //   54: aaload
/*    */     //   55: astore #7
/*    */     //   57: aload #7
/*    */     //   59: astore #8
/*    */     //   61: iconst_0
/*    */     //   62: istore #9
/*    */     //   64: aload #8
/*    */     //   66: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   69: aload_2
/*    */     //   70: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   73: ifeq -> 81
/*    */     //   76: aload #7
/*    */     //   78: goto -> 88
/*    */     //   81: iinc #5, 1
/*    */     //   84: goto -> 44
/*    */     //   87: aconst_null
/*    */     //   88: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 6
/*    */     //   #15	-> 22
/*    */     //   #57	-> 37
/*    */     //   #15	-> 64
/*    */     //   #57	-> 73
/*    */     //   #58	-> 87
/*    */     //   #15	-> 88
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   64	9	9	$i$a$-firstOrNull-UserSettings$findActiveProfile$1	I
/*    */     //   61	12	8	it	Lai/grazie/gec/model/settings/StyleProfile;
/*    */     //   57	24	7	element$iv	Ljava/lang/Object;
/*    */     //   37	51	4	$i$f$firstOrNull	I
/*    */     //   34	54	3	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */     //   22	67	2	id	Ljava/lang/String;
/*    */     //   0	89	0	this	Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   0	89	1	defaultProfiles	[Lai/grazie/gec/model/settings/StyleProfile;
/*    */   } @Nullable
/*    */   public final StyleProfile findProfile(@NotNull String id) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'id'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield customProfiles : [Lai/grazie/gec/model/settings/StyleProfile;
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: iconst_0
/*    */     //   14: istore #4
/*    */     //   16: aload_2
/*    */     //   17: arraylength
/*    */     //   18: istore #5
/*    */     //   20: iload #4
/*    */     //   22: iload #5
/*    */     //   24: if_icmpge -> 63
/*    */     //   27: aload_2
/*    */     //   28: iload #4
/*    */     //   30: aaload
/*    */     //   31: astore #6
/*    */     //   33: aload #6
/*    */     //   35: astore #7
/*    */     //   37: iconst_0
/*    */     //   38: istore #8
/*    */     //   40: aload #7
/*    */     //   42: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   45: aload_1
/*    */     //   46: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   49: ifeq -> 57
/*    */     //   52: aload #6
/*    */     //   54: goto -> 64
/*    */     //   57: iinc #4, 1
/*    */     //   60: goto -> 20
/*    */     //   63: aconst_null
/*    */     //   64: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 6
/*    */     //   #59	-> 13
/*    */     //   #18	-> 40
/*    */     //   #59	-> 49
/*    */     //   #60	-> 63
/*    */     //   #18	-> 64
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   40	9	8	$i$a$-firstOrNull-UserSettings$findProfile$1	I
/*    */     //   37	12	7	it	Lai/grazie/gec/model/settings/StyleProfile;
/*    */     //   33	24	6	element$iv	Ljava/lang/Object;
/*    */     //   13	51	3	$i$f$firstOrNull	I
/*    */     //   11	53	2	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */     //   0	65	0	this	Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   0	65	1	id	Ljava/lang/String;
/*    */   } public boolean equals(@Nullable Object other) {
/* 21 */     if (this == other) return true; 
/* 22 */     if (!(other instanceof UserSettings)) return false;
/*    */     
/* 24 */     if (!Intrinsics.areEqual(this.activeProfileId, ((UserSettings)other).activeProfileId)) return false; 
/* 25 */     return Arrays.equals((Object[])this.customProfiles, (Object[])((UserSettings)other).customProfiles);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 29 */     int result = (this.activeProfileId != null) ? this.activeProfileId.hashCode() : 0;
/* 30 */     result = 31 * result + Arrays.hashCode((Object[])this.customProfiles);
/* 31 */     return result;
/*    */   }
/*    */   public final boolean isEmpty() {
/* 34 */     return (this.activeProfileId == null && ((this.customProfiles.length == 0)));
/*    */   } @NotNull
/*    */   public final UserSettings dropDefaults(@NotNull SettingStructure defaults) {
/* 37 */     Intrinsics.checkNotNullParameter(defaults, "defaults"); LanguageSettings[] arrayOfLanguageSettings1 = defaults.getSettings(); int $i$f$flatMap = 0;
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
/* 61 */     LanguageSettings[] arrayOfLanguageSettings2 = arrayOfLanguageSettings1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0; byte b1; int m;
/* 62 */     for (b1 = 0, m = arrayOfLanguageSettings2.length; b1 < m; ) { Object element$iv$iv = arrayOfLanguageSettings2[b1];
/* 63 */       Object object1 = element$iv$iv; int $i$a$-flatMap-UserSettings$dropDefaults$languageSettings$1 = 0; Iterable<Setting> list$iv$iv = object1.getFlattenedSettings();
/* 64 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv); }
/*    */     
/* 66 */     List list1 = (List)destination$iv$iv; int $i$f$associateBy = 0;
/* 67 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list1, 10)), 16);
/* 68 */     destination$iv$iv = list1; Map<Object, Object> map1 = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0;
/* 69 */     for (Object element$iv$iv : destination$iv$iv) {
/* 70 */       Setting setting = (Setting)element$iv$iv; Map<Object, Object> map = map1; int $i$a$-associateBy-UserSettings$dropDefaults$languageSettings$2 = 0; map.put(setting.getId(), element$iv$iv);
/*    */     } 
/* 72 */     Map<Object, Object> languageSettings = map1; StyleProfile[] arrayOfStyleProfile1 = defaults.getStyles(); int i = 0;
/* 73 */     int j = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfStyleProfile1.length), 16);
/* 74 */     StyleProfile[] arrayOfStyleProfile4 = arrayOfStyleProfile1; Map<Object, Object> map2 = new LinkedHashMap<>(j); int k = 0; byte b2; int n;
/* 75 */     for (b2 = 0, n = arrayOfStyleProfile4.length; b2 < n; ) { Object element$iv$iv = arrayOfStyleProfile4[b2];
/* 76 */       Object object1 = element$iv$iv; Map<Object, Object> map = map2; int $i$a$-associateBy-UserSettings$dropDefaults$predefinedProfiles$1 = 0; map.put(object1.getId(), element$iv$iv); }
/*    */     
/* 78 */     Map<Object, Object> predefinedProfiles = map2; StyleProfile[] arrayOfStyleProfile2 = this.customProfiles; int $i$f$mapNotNull = 0;
/* 79 */     StyleProfile[] arrayOfStyleProfile3 = arrayOfStyleProfile2; Collection collection1 = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 87 */     StyleProfile[] arrayOfStyleProfile5 = arrayOfStyleProfile3; int $i$f$forEach = 0;
/* 88 */     byte b3 = 0; int i1 = arrayOfStyleProfile5.length; if (b3 < i1) { Object element$iv$iv$iv = arrayOfStyleProfile5[b3], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; Object object1 = element$iv$iv;
/*    */       int $i$a$-mapNotNull-UserSettings$dropDefaults$newCustomProfiles$1 = 0; }
/*    */     
/* 91 */     List list2 = (List)collection1;
/*    */     int $i$f$toTypedArray = 0;
/* 93 */     Collection thisCollection$iv = list2;
/*    */     
/* 95 */     StyleProfile[] newCustomProfiles = (StyleProfile[])thisCollection$iv.toArray((Object[])new StyleProfile[0]); String str1 = this.activeProfileId, it = str1;
/* 96 */     int $i$a$-takeIf-UserSettings$dropDefaults$1 = 0;
/*    */     StyleProfile[] arrayOfStyleProfile6 = newCustomProfiles;
/*    */     String str2 = (!Intrinsics.areEqual(it, defaults.getDefaultProfileId())) ? str1 : null;
/*    */     return new UserSettings(str2, arrayOfStyleProfile6);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Nullable
/*    */   private final String activeProfileId;
/*    */   @NotNull
/*    */   private final StyleProfile[] customProfiles;
/*    */   @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(StyleProfile.class), (KSerializer)StyleProfile.$serializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/gec/model/settings/UserSettings$Companion;", "", "()V", "EMPTY", "Lai/grazie/gec/model/settings/UserSettings;", "getEMPTY", "()Lai/grazie/gec/model/settings/UserSettings;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<UserSettings> serializer() {
/*    */       return (KSerializer<UserSettings>)UserSettings.$serializer.INSTANCE;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final UserSettings getEMPTY() {
/*    */       return UserSettings.EMPTY;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final UserSettings EMPTY = new UserSettings(null, null, 3, null);
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.activeProfileId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StyleProfile[] component2() {
/*    */     return this.customProfiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UserSettings copy(@Nullable String activeProfileId, @NotNull StyleProfile[] customProfiles) {
/*    */     Intrinsics.checkNotNullParameter(customProfiles, "customProfiles");
/*    */     return new UserSettings(activeProfileId, customProfiles);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "UserSettings(activeProfileId=" + this.activeProfileId + ", customProfiles=" + Arrays.toString((Object[])this.customProfiles) + ")";
/*    */   }
/*    */   
/*    */   public UserSettings() {
/*    */     this((String)null, (StyleProfile[])null, 3, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\settings\UserSettings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */