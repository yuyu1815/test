/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.modules.PolymorphicModuleBuilder;
/*    */ import kotlinx.serialization.modules.SerializersModule;
/*    */ import kotlinx.serialization.modules.SerializersModuleBuilder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegister$Companion;", "", "<init>", "()V", "makeSerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "registersList", "", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegister;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nSerializableEventRegister.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableEventRegister.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventRegister$Companion\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,52:1\n31#2,2:53\n247#2,9:55\n33#2:64\n*S KotlinDebug\n*F\n+ 1 SerializableEventRegister.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventRegister$Companion\n*L\n22#1:53,2\n23#1:55,9\n22#1:64\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final SerializersModule makeSerializersModule(@NotNull List registersList) {
/* 22 */     Intrinsics.checkNotNullParameter(registersList, "registersList"); int $i$f$SerializersModule = 0;
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
/* 53 */     SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
/* 54 */     SerializersModuleBuilder $this$makeSerializersModule_u24lambda_u241 = builder$iv; int $i$a$-SerializersModule-SerializableEventRegister$Companion$makeSerializersModule$1 = 0;
/*    */     SerializersModuleBuilder serializersModuleBuilder1 = $this$makeSerializersModule_u24lambda_u241;
/*    */     KClass baseClass$iv = Reflection.getOrCreateKotlinClass(SerializableEvent.class);
/* 57 */     KSerializer baseSerializer$iv = null;
/*    */     
/*    */     int $i$f$polymorphic = 0;
/* 60 */     PolymorphicModuleBuilder<? super SerializableEvent> polymorphicModuleBuilder1 = new PolymorphicModuleBuilder(baseClass$iv, baseSerializer$iv);
/* 61 */     PolymorphicModuleBuilder<? super SerializableEvent> $this$makeSerializersModule_u24lambda_u241_u24lambda_u240 = polymorphicModuleBuilder1; int $i$a$-polymorphic$default-SerializableEventRegister$Companion$makeSerializersModule$1$1 = 0; PolymorphicModuleBuilder<? super SerializableEvent> moduleBuilder = $this$makeSerializersModule_u24lambda_u241_u24lambda_u240; for (SerializableEventRegister info : registersList)
/* 62 */       info.registerSubclass(moduleBuilder);  polymorphicModuleBuilder1.buildTo(serializersModuleBuilder1);
/*    */     
/* 64 */     return builder$iv.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventRegister$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */