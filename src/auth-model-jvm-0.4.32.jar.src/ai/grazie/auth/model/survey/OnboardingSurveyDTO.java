/*    */ package ai.grazie.auth.model.survey;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201BW\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\016\020\n\032\n\022\004\022\0020\f\030\0010\013\022\016\020\r\032\n\022\004\022\0020\f\030\0010\013\022\b\020\016\032\004\030\0010\017¢\006\002\020\020BE\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\020\b\002\020\n\032\n\022\004\022\0020\f\030\0010\013\022\020\b\002\020\r\032\n\022\004\022\0020\f\030\0010\013¢\006\002\020\021J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\013\020\036\032\004\030\0010\tHÆ\003J\026\020\037\032\n\022\004\022\0020\f\030\0010\013HÆ\003¢\006\002\020\027J\026\020 \032\n\022\004\022\0020\f\030\0010\013HÆ\003¢\006\002\020\027JR\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\020\b\002\020\n\032\n\022\004\022\0020\f\030\0010\0132\020\b\002\020\r\032\n\022\004\022\0020\f\030\0010\013HÆ\001¢\006\002\020\"J\023\020#\032\0020$2\b\020%\032\004\030\0010\001H\002J\b\020&\032\0020\003H\026J\t\020'\032\0020\fHÖ\001J&\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÁ\001¢\006\002\b/R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\024\020\025R\033\020\r\032\n\022\004\022\0020\f\030\0010\013¢\006\n\n\002\020\030\032\004\b\026\020\027R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\031\020\032R\033\020\n\032\n\022\004\022\0020\f\030\0010\013¢\006\n\n\002\020\030\032\004\b\033\020\027¨\0062"}, d2 = {"Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "", "seen1", "", "case", "Lai/grazie/auth/model/survey/GrazieUserUseCase;", "role", "Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "company", "Lai/grazie/auth/model/survey/GrazieUserCompanySize;", "tools", "", "", "goals", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/auth/model/survey/GrazieUserUseCase;Lai/grazie/auth/model/survey/GrazieUserWorkRole;Lai/grazie/auth/model/survey/GrazieUserCompanySize;[Ljava/lang/String;[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/auth/model/survey/GrazieUserUseCase;Lai/grazie/auth/model/survey/GrazieUserWorkRole;Lai/grazie/auth/model/survey/GrazieUserCompanySize;[Ljava/lang/String;[Ljava/lang/String;)V", "getCase", "()Lai/grazie/auth/model/survey/GrazieUserUseCase;", "getCompany", "()Lai/grazie/auth/model/survey/GrazieUserCompanySize;", "getGoals", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getRole", "()Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "getTools", "component1", "component2", "component3", "component4", "component5", "copy", "(Lai/grazie/auth/model/survey/GrazieUserUseCase;Lai/grazie/auth/model/survey/GrazieUserWorkRole;Lai/grazie/auth/model/survey/GrazieUserCompanySize;[Ljava/lang/String;[Ljava/lang/String;)Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */ public final class OnboardingSurveyDTO {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final GrazieUserUseCase case; @NotNull private final GrazieUserWorkRole role; @Nullable private final GrazieUserCompanySize company; @Nullable private final String[] tools; @Nullable
/*    */   private final String[] goals; @JvmField
/*    */   @NotNull
/*  9 */   private static final KSerializer<Object>[] $childSerializers; public OnboardingSurveyDTO(@NotNull GrazieUserUseCase case, @NotNull GrazieUserWorkRole role, @Nullable GrazieUserCompanySize company, @Nullable String[] tools, @Nullable String[] goals) { this.case = case;
/* 10 */     this.role = role;
/* 11 */     this.company = company;
/* 12 */     this.tools = tools;
/* 13 */     this.goals = goals; } static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = GrazieUserUseCase.Companion.serializer(); arrayOfKSerializer[1] = GrazieUserWorkRole.Companion.serializer(); arrayOfKSerializer[2] = GrazieUserCompanySize.Companion.serializer(); arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[4] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/survey/OnboardingSurveyDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"}) public static final class $serializer implements GeneratedSerializer<OnboardingSurveyDTO> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])OnboardingSurveyDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[5]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[2]); arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[3]); arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[4]); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public OnboardingSurveyDTO deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; GrazieUserUseCase grazieUserUseCase = null; GrazieUserWorkRole grazieUserWorkRole = null; GrazieUserCompanySize grazieUserCompanySize = null; String[] arrayOfString1 = null, arrayOfString2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])OnboardingSurveyDTO.$childSerializers; if (compositeDecoder.decodeSequentially()) { grazieUserUseCase = (GrazieUserUseCase)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserUseCase); i |= 0x1; grazieUserWorkRole = (GrazieUserWorkRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], grazieUserWorkRole); i |= 0x2; grazieUserCompanySize = (GrazieUserCompanySize)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], grazieUserCompanySize); i |= 0x4; arrayOfString1 = (String[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfString1); i |= 0x8; arrayOfString2 = (String[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], arrayOfString2); i |= 0x10; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: grazieUserUseCase = (GrazieUserUseCase)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserUseCase); i |= 0x1; continue;case 1: grazieUserWorkRole = (GrazieUserWorkRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], grazieUserWorkRole); i |= 0x2; continue;case 2: grazieUserCompanySize = (GrazieUserCompanySize)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], grazieUserCompanySize); i |= 0x4; continue;case 3: arrayOfString1 = (String[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfString1); i |= 0x8; continue;case 4: arrayOfString2 = (String[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], arrayOfString2); i |= 0x10; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new OnboardingSurveyDTO(i, grazieUserUseCase, grazieUserWorkRole, grazieUserCompanySize, arrayOfString1, arrayOfString2, null); } public void serialize(@NotNull Encoder encoder, @NotNull OnboardingSurveyDTO value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); OnboardingSurveyDTO.write$Self$auth_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.survey.OnboardingSurveyDTO", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("case", false); pluginGeneratedSerialDescriptor.addElement("role", false); pluginGeneratedSerialDescriptor.addElement("company", true); pluginGeneratedSerialDescriptor.addElement("tools", true); pluginGeneratedSerialDescriptor.addElement("goals", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/survey/OnboardingSurveyDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "auth-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<OnboardingSurveyDTO> serializer() { return (KSerializer<OnboardingSurveyDTO>)OnboardingSurveyDTO.$serializer.INSTANCE; } } @Nullable public final String[] getGoals() { return this.goals; }
/*    */   @NotNull public final GrazieUserUseCase getCase() { return this.case; }
/*    */   @NotNull public final GrazieUserWorkRole getRole() { return this.role; }
/* 16 */   @Nullable public final GrazieUserCompanySize getCompany() { return this.company; } @Nullable public final String[] getTools() { return this.tools; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 17 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 19 */     (OnboardingSurveyDTO)other;
/*    */     
/* 21 */     if (this.case != ((OnboardingSurveyDTO)other).case) return false; 
/* 22 */     if (this.role != ((OnboardingSurveyDTO)other).role) return false; 
/* 23 */     if (this.company != ((OnboardingSurveyDTO)other).company) return false; 
/* 24 */     if (this.tools != null)
/* 25 */     { if (((OnboardingSurveyDTO)other).tools == null) return false; 
/* 26 */       if (!Arrays.equals((Object[])this.tools, (Object[])((OnboardingSurveyDTO)other).tools)) return false;  }
/* 27 */     else if (((OnboardingSurveyDTO)other).tools != null) { return false; }
/* 28 */      if (this.goals != null)
/* 29 */     { if (((OnboardingSurveyDTO)other).goals == null) return false; 
/* 30 */       if (!Arrays.equals((Object[])this.goals, (Object[])((OnboardingSurveyDTO)other).goals)) return false;  }
/* 31 */     else if (((OnboardingSurveyDTO)other).goals != null) { return false; }
/*    */     
/* 33 */     return true; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 37 */     int result = this.case.hashCode();
/* 38 */     result = 31 * result + this.role.hashCode();
/* 39 */     result = 31 * result + ((this.company != null) ? this.company.hashCode() : 0);
/* 40 */     result = 31 * result + ((this.tools != null) ? Arrays.hashCode((Object[])this.tools) : 0);
/* 41 */     result = 31 * result + ((this.goals != null) ? Arrays.hashCode((Object[])this.goals) : 0);
/* 42 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieUserUseCase component1() {
/*    */     return this.case;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieUserWorkRole component2() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final GrazieUserCompanySize component3() {
/*    */     return this.company;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String[] component4() {
/*    */     return this.tools;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String[] component5() {
/*    */     return this.goals;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OnboardingSurveyDTO copy(@NotNull GrazieUserUseCase case, @NotNull GrazieUserWorkRole role, @Nullable GrazieUserCompanySize company, @Nullable String[] tools, @Nullable String[] goals) {
/*    */     Intrinsics.checkNotNullParameter(case, "case");
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     return new OnboardingSurveyDTO(case, role, company, tools, goals);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OnboardingSurveyDTO(case=" + this.case + ", role=" + this.role + ", company=" + this.company + ", tools=" + Arrays.toString((Object[])this.tools) + ", goals=" + Arrays.toString((Object[])this.goals) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\survey\OnboardingSurveyDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */