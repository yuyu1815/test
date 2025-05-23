/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.modules.PolymorphicModuleBuilder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\034\n\002\030\002\n\000\b\026\030\0002\0020\001B\033\b\002\022\020\020\002\032\f\022\b\022\006\022\002\b\0030\0040\003¢\006\004\b\005\020\006B\"\b\026\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\004\b\005\020\fJ\026\020\r\032\0020\n2\f\020\016\032\b\022\004\022\0020\0200\017H\026J\022\020\021\032\f\022\b\022\006\022\002\b\0030\0230\022H\026R\030\020\002\032\f\022\b\022\006\022\002\b\0030\0040\003X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegisterImpl;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegister;", "pairs", "", "Lcom/intellij/ml/llm/matterhorn/events/ClassWithSerializer;", "<init>", "(Ljava/util/List;)V", "initializer", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegisterImplBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "registerSubclass", "builder", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "getSubclasses", "", "Lkotlin/reflect/KClass;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nSerializableEventRegisterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableEventRegisterImpl.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventRegisterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1863#2,2:54\n1557#2:56\n1628#2,3:57\n*S KotlinDebug\n*F\n+ 1 SerializableEventRegisterImpl.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventRegisterImpl\n*L\n27#1:54,2\n33#1:56\n33#1:57,3\n*E\n"})
/*    */ public class SerializableEventRegisterImpl implements SerializableEventRegister {
/*    */   @NotNull
/*    */   private final List<ClassWithSerializer<?>> pairs;
/*    */   
/*    */   private SerializableEventRegisterImpl(List<ClassWithSerializer<?>> pairs) {
/* 19 */     this.pairs = pairs;
/*    */   }
/*    */ 
/*    */   
/*    */   public SerializableEventRegisterImpl(@NotNull Function1 initializer) {
/* 24 */     this(serializableEventRegisterImplBuilder.getList());
/*    */   }
/*    */   
/* 27 */   public void registerSubclass(@NotNull PolymorphicModuleBuilder builder) { Intrinsics.checkNotNullParameter(builder, "builder"); Iterable<ClassWithSerializer<?>> $this$forEach$iv = this.pairs; int $i$f$forEach = 0;
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
/* 54 */     Iterator<ClassWithSerializer<?>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<?> element$iv = (Object<?>)iterator.next(); ClassWithSerializer it = (ClassWithSerializer)element$iv; int $i$a$-forEach-SerializableEventRegisterImpl$registerSubclass$1 = 0; it.registerIn(builder); }
/*    */      } @NotNull public Iterable<KClass<?>> getSubclasses() { Iterable<ClassWithSerializer<?>> $this$map$iv = this.pairs; int $i$f$map = 0;
/* 56 */     Iterable<ClassWithSerializer<?>> iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 57 */     for (Object<?> item$iv$iv : iterable1) {
/* 58 */       ClassWithSerializer classWithSerializer = (ClassWithSerializer)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-SerializableEventRegisterImpl$getSubclasses$1 = 0; collection.add(classWithSerializer.getKClass());
/* 59 */     }  return destination$iv$iv; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventRegisterImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */