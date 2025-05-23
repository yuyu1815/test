/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MutablePropertyReference0;
/*     */ import kotlin.jvm.internal.MutablePropertyReference0Impl;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.properties.Delegates;
/*     */ import kotlin.properties.ReadWriteProperty;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021²\006\n\020\022\032\0020\023X\002"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactDependencySerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "core", "cached", ""})
/*     */ @SourceDebugExtension({"SMAP\nArtifact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/ArtifactDependencySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,514:1\n476#2,4:515\n571#3,4:519\n329#4,8:523\n329#4,8:531\n*S KotlinDebug\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/ArtifactDependencySerializer\n*L\n173#1:515,4\n180#1:519,4\n168#1:523,8\n169#1:531,8\n*E\n"})
/*     */ public final class ArtifactDependencySerializer
/*     */   implements KSerializer<ArtifactDependency>
/*     */ {
/*     */   @NotNull
/* 167 */   private final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("ArtifactDependency", new SerialDescriptor[0], ArtifactDependencySerializer::descriptor$lambda$0); @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; } private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
/* 168 */     Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder1 = $this$buildClassSerialDescriptor; String elementName$iv = "id";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     
/*     */     ClassSerialDescriptorBuilder $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "cached";
/* 533 */     annotations$iv = CollectionsKt.emptyList();
/* 534 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 536 */     descriptor$iv = BooleanSerializer.INSTANCE.getDescriptor();
/* 537 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull ArtifactDependency value) {
/*     */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Encoder encoder1 = encoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$encodeStructure = 0;
/*     */     CompositeEncoder composite$iv = encoder1.beginStructure(descriptor$iv);
/*     */     CompositeEncoder $this$serialize_u24lambda_u241 = composite$iv;
/*     */     int $i$a$-encodeStructure-ArtifactDependencySerializer$serialize$1 = 0;
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 0, ArtifactKt.dumpArtifactId(value.getArtifact()));
/*     */     $this$serialize_u24lambda_u241.encodeBooleanElement(getDescriptor(), 1, value.getCached());
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ArtifactDependency deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     Decoder decoder1 = decoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$decodeStructure = 0;
/*     */     CompositeDecoder composite$iv = decoder1.beginStructure(descriptor$iv);
/*     */     CompositeDecoder $this$deserialize_u24lambda_u244 = composite$iv;
/*     */     int $i$a$-decodeStructure-ArtifactDependencySerializer$deserialize$1 = 0;
/*     */     ArtifactId<?> id = null;
/*     */     ReadWriteProperty cached$delegate = Delegates.INSTANCE.notNull();
/*     */     while (true) {
/*     */       int index = $this$deserialize_u24lambda_u244.decodeElementIndex(getDescriptor());
/*     */       if (index != -1) {
/*     */         switch (index) {
/*     */           case 0:
/*     */             id = ArtifactKt.parseArtifactId($this$deserialize_u24lambda_u244.decodeStringElement(getDescriptor(), 0));
/*     */             continue;
/*     */           case 1:
/*     */             access$deserialize$lambda$4$lambda$3(cached$delegate, $this$deserialize_u24lambda_u244.decodeBooleanElement(getDescriptor(), 1));
/*     */             continue;
/*     */         } 
/*     */         throw new SerializationException("Unexpected index " + index);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     if (id == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("id"); 
/*     */     super(null, access$deserialize$lambda$4$lambda$2(cached$delegate));
/*     */     Object result$iv;
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */     return (ArtifactDependency)result$iv;
/*     */   }
/*     */   
/*     */   private static final boolean deserialize$lambda$4$lambda$2(ReadWriteProperty $cached$delegate) {
/*     */     return ((Boolean)$cached$delegate.getValue(null, $$delegatedProperties[0])).booleanValue();
/*     */   }
/*     */   
/*     */   private static final void deserialize$lambda$4$lambda$3(ReadWriteProperty $cached$delegate, boolean <set-?>) {
/*     */     $cached$delegate.setValue(null, $$delegatedProperties[0], Boolean.valueOf(<set-?>));
/*     */   }
/*     */   
/*     */   static {
/*     */     KProperty[] arrayOfKProperty = new KProperty[1];
/*     */     arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty0((MutablePropertyReference0)new MutablePropertyReference0Impl(ArtifactDependencySerializer.class, "cached", "<v#0>", 0));
/*     */     $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ArtifactDependencySerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */