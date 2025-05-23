/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\030\000*\004\b\000\020\0012\016\022\n\022\b\022\004\022\002H\0010\0030\002B\025\022\f\020\004\032\b\022\004\022\0028\0000\002¢\006\004\b\005\020\006J\036\020\r\032\0020\0162\006\020\017\032\0020\0202\f\020\021\032\b\022\004\022\0028\0000\003H\026J\026\020\022\032\b\022\004\022\0028\0000\0032\006\020\023\032\0020\024H\026R\027\020\004\032\b\022\004\022\0028\0000\002¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\f¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactSerializer;", "O", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "dataSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "getDataSerializer", "()Lkotlinx/serialization/KSerializer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nArtifact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/ArtifactSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,514:1\n476#2,4:515\n571#3,4:519\n329#4,8:523\n329#4,8:531\n329#4,8:539\n329#4,8:547\n329#4,8:555\n329#4,8:563\n*S KotlinDebug\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/ArtifactSerializer\n*L\n420#1:515,4\n432#1:519,4\n410#1:523,8\n411#1:531,8\n412#1:539,8\n413#1:547,8\n414#1:555,8\n415#1:563,8\n*E\n"})
/*     */ public final class ArtifactSerializer<O>
/*     */   implements KSerializer<Artifact<O>>
/*     */ {
/*     */   @NotNull
/*     */   private final KSerializer<O> dataSerializer;
/*     */   @NotNull
/*     */   private final SerialDescriptor descriptor;
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<O> getDataSerializer() {
/*     */     return this.dataSerializer;
/*     */   }
/*     */   
/*     */   public ArtifactSerializer(@NotNull KSerializer<O> dataSerializer) {
/* 407 */     this.dataSerializer = dataSerializer;
/*     */     
/* 409 */     this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("Artifact", new SerialDescriptor[0], this::descriptor$lambda$0); } @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; } private static final Unit descriptor$lambda$0(ArtifactSerializer this$0, ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
/* 410 */     Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder1 = $this$buildClassSerialDescriptor; String elementName$iv = "id";
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 525 */     List annotations$iv = CollectionsKt.emptyList();
/* 526 */     boolean isOptional$iv = false;
/*     */     int $i$f$element = 0;
/* 528 */     SerialDescriptor descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 529 */     classSerialDescriptorBuilder1.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     ClassSerialDescriptorBuilder $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "title";
/*     */     isOptional$iv = true;
/* 533 */     annotations$iv = CollectionsKt.emptyList();
/*     */     
/*     */     $i$f$element = 0;
/* 536 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 537 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "description";
/* 541 */     annotations$iv = CollectionsKt.emptyList();
/* 542 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 544 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 545 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "reasoning";
/* 549 */     annotations$iv = CollectionsKt.emptyList();
/* 550 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 552 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 553 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "statistics";
/* 557 */     annotations$iv = CollectionsKt.emptyList();
/* 558 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 560 */     descriptor$iv = ArtifactStatistic.Companion.serializer().getDescriptor();
/* 561 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "dependencies";
/* 565 */     annotations$iv = CollectionsKt.emptyList();
/* 566 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 568 */     descriptor$iv = (new ArrayListSerializer(ArtifactDependency.Companion.serializer())).getDescriptor();
/* 569 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "content", this$0.dataSerializer.getDescriptor(), null, false, 12, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull Artifact<?> value) {
/*     */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Encoder encoder1 = encoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$encodeStructure = 0;
/*     */     CompositeEncoder composite$iv = encoder1.beginStructure(descriptor$iv);
/*     */     CompositeEncoder $this$serialize_u24lambda_u241 = composite$iv;
/*     */     int $i$a$-encodeStructure-ArtifactSerializer$serialize$1 = 0;
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 0, ArtifactKt.dumpArtifactId(value.getId()));
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 1, value.getTitle());
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 2, value.getDescription());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 3, (SerializationStrategy)ArtifactReasoning.Companion.serializer(), value.getReasoning());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 4, (SerializationStrategy)ArtifactStatistic.Companion.serializer(), value.getStatistics());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 5, (SerializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), value.getDependencies());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 6, (SerializationStrategy)getDataSerializer(), value.getContent());
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Artifact<O> deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     Decoder decoder1 = decoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$decodeStructure = 0;
/*     */     CompositeDecoder composite$iv = decoder1.beginStructure(descriptor$iv);
/*     */     CompositeDecoder $this$deserialize_u24lambda_u242 = composite$iv;
/*     */     int $i$a$-decodeStructure-ArtifactSerializer$deserialize$1 = 0;
/*     */     ArtifactId<?> id = null;
/*     */     String title = null;
/*     */     String description = null;
/*     */     ArtifactReasoning reasoning = null;
/*     */     ArtifactStatistic statistics = null;
/*     */     List dependencies = null;
/*     */     Object content = null;
/*     */     while (true) {
/*     */       int index = $this$deserialize_u24lambda_u242.decodeElementIndex(getDescriptor());
/*     */       if (index != -1) {
/*     */         switch (index) {
/*     */           case 0:
/*     */             Intrinsics.checkNotNull(ArtifactKt.parseArtifactId($this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 0)), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ArtifactId<O of com.intellij.ml.llm.matterhorn.ArtifactSerializer>");
/*     */             id = ArtifactKt.parseArtifactId($this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 0));
/*     */             continue;
/*     */           case 1:
/*     */             title = $this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 1);
/*     */             continue;
/*     */           case 2:
/*     */             description = $this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 2);
/*     */             continue;
/*     */           case 3:
/*     */             reasoning = (ArtifactReasoning)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 3, (DeserializationStrategy)ArtifactReasoning.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 4:
/*     */             statistics = (ArtifactStatistic)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 4, (DeserializationStrategy)ArtifactStatistic.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 5:
/*     */             dependencies = (List)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 5, (DeserializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), null, 8, null);
/*     */             continue;
/*     */           case 6:
/*     */             content = CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 6, (DeserializationStrategy)getDataSerializer(), null, 8, null);
/*     */             continue;
/*     */         } 
/*     */         throw new SerializationException("Unexpected index " + index);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     if (id == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("id"); 
/*     */     if (statistics == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("statistics"); 
/*     */     if (title == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */     if (description == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("description"); 
/*     */     if (dependencies == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("dependencies"); 
/*     */     if (reasoning == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("reasoning"); 
/*     */     Intrinsics.checkNotNull(content);
/*     */     super((ArtifactId<O>)description, null, (String)dependencies, null, (List<ArtifactDependency>)reasoning, null, (O)content);
/*     */     Object result$iv = title;
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */     return (Artifact<O>)result$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ArtifactSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */