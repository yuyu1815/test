/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NotImplementedError;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.StringCompanionObject;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\020\020\t\032\0020\0022\006\020\n\032\0020\013H\026J\030\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\002H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactEventSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactEvent;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "core"})
/*     */ @SourceDebugExtension({"SMAP\nArtifactEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtifactEvent.kt\ncom/intellij/ml/llm/matterhorn/ArtifactEventSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,77:1\n476#2,2:78\n478#2,2:84\n1557#3:80\n1628#3,3:81\n329#4,8:86\n329#4,8:94\n329#4,8:102\n329#4,8:110\n329#4,8:118\n329#4,8:126\n329#4,8:134\n329#4,8:142\n*S KotlinDebug\n*F\n+ 1 ArtifactEvent.kt\ncom/intellij/ml/llm/matterhorn/ArtifactEventSerializer\n*L\n67#1:78,2\n67#1:84,2\n73#1:80\n73#1:81,3\n52#1:86,8\n53#1:94,8\n54#1:102,8\n55#1:110,8\n56#1:118,8\n57#1:126,8\n58#1:134,8\n59#1:142,8\n*E\n"})
/*     */ public final class ArtifactEventSerializer
/*     */   implements KSerializer<ArtifactEvent>
/*     */ {
/*     */   @NotNull
/*  51 */   private final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("ArtifactEvent", new SerialDescriptor[0], ArtifactEventSerializer::descriptor$lambda$0); @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; } private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
/*  52 */     Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder1 = $this$buildClassSerialDescriptor; String elementName$iv = "status";
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
/*  88 */     List annotations$iv = CollectionsKt.emptyList();
/*  89 */     boolean isOptional$iv = false;
/*     */     int $i$f$element = 0;
/*  91 */     SerialDescriptor descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/*  92 */     classSerialDescriptorBuilder1.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     ClassSerialDescriptorBuilder $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "id";
/*  96 */     annotations$iv = CollectionsKt.emptyList();
/*  97 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/*  99 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 100 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "type";
/* 104 */     annotations$iv = CollectionsKt.emptyList();
/* 105 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 107 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 108 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "title";
/* 112 */     annotations$iv = CollectionsKt.emptyList();
/* 113 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 115 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 116 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "statistics";
/* 120 */     annotations$iv = CollectionsKt.emptyList();
/* 121 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 123 */     descriptor$iv = ArtifactStatistic.Companion.serializer().getDescriptor();
/* 124 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "dependencies";
/* 128 */     annotations$iv = CollectionsKt.emptyList();
/* 129 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 131 */     descriptor$iv = (new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE)).getDescriptor();
/* 132 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "requesterId";
/* 136 */     annotations$iv = CollectionsKt.emptyList();
/* 137 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 139 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 140 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "errorMessage";
/* 144 */     annotations$iv = CollectionsKt.emptyList();
/* 145 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 147 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 148 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ArtifactEvent deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     throw new NotImplementedError("deserialize() method is not implemented for ArtifactEvent.");
/*     */   }
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull ArtifactEvent value) {
/*     */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Encoder encoder1 = encoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$encodeStructure = 0;
/*     */     CompositeEncoder composite$iv = encoder1.beginStructure(descriptor$iv);
/*     */     CompositeEncoder $this$serialize_u24lambda_u242 = composite$iv;
/*     */     int $i$a$-encodeStructure-ArtifactEventSerializer$serialize$1 = 0;
/*     */     $this$serialize_u24lambda_u242.encodeSerializableElement(getDescriptor(), 0, (SerializationStrategy)ArtifactStatus.Companion.serializer(), value.getStatus());
/*     */     $this$serialize_u24lambda_u242.encodeStringElement(getDescriptor(), 1, value.getId());
/*     */     $this$serialize_u24lambda_u242.encodeStringElement(getDescriptor(), 2, value.getType());
/*     */     $this$serialize_u24lambda_u242.encodeStringElement(getDescriptor(), 3, value.getTitle());
/*     */     $this$serialize_u24lambda_u242.encodeSerializableElement(getDescriptor(), 4, (SerializationStrategy)ArtifactStatistic.Companion.serializer(), value.getStatistics());
/*     */     List<ArtifactDependency> list1 = value.getDependencies();
/*     */     SerializationStrategy serializationStrategy = (SerializationStrategy)BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
/*     */     byte b = 5;
/*     */     SerialDescriptor serialDescriptor1 = getDescriptor();
/*     */     CompositeEncoder compositeEncoder1 = $this$serialize_u24lambda_u242;
/*     */     int $i$f$map = 0;
/*     */     List<ArtifactDependency> list2 = list1;
/*     */     Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (ArtifactDependency item$iv$iv : list2) {
/*     */       ArtifactDependency artifactDependency1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-ArtifactEventSerializer$serialize$1$1 = 0;
/*     */       collection.add(artifactDependency1.getArtifact().toFileName());
/*     */     } 
/*     */     List list = (List)destination$iv$iv;
/*     */     compositeEncoder1.encodeSerializableElement(serialDescriptor1, b, serializationStrategy, list);
/*     */     $this$serialize_u24lambda_u242.encodeNullableSerializableElement(getDescriptor(), 6, (SerializationStrategy)BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), value.getRequesterId());
/*     */     $this$serialize_u24lambda_u242.encodeNullableSerializableElement(getDescriptor(), 7, (SerializationStrategy)BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), value.getErrorMessage());
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactEventSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */