/*    */ package ai.grazie.utils;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003B\036\022\027\020\004\032\023\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\b\006¢\006\002\020\007J\"\020\f\032\0028\0012\006\020\r\032\0020\0162\n\020\017\032\006\022\002\b\0030\020H\002¢\006\002\020\021R\"\020\004\032\023\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\b\006¢\006\b\n\000\032\004\b\b\020\tR\032\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\013X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/utils/LazyWithReceiverImpl;", "This", "T", "Lai/grazie/utils/LazyWithReceiver;", "initializer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getInitializer", "()Lkotlin/jvm/functions/Function1;", "values", "Ljava/util/WeakHashMap;", "getValue", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nLazyWithReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyWithReceiver.kt\nai/grazie/utils/LazyWithReceiverImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,21:1\n381#2,7:22\n*S KotlinDebug\n*F\n+ 1 LazyWithReceiver.kt\nai/grazie/utils/LazyWithReceiverImpl\n*L\n17#1:22,7\n*E\n"})
/*    */ public final class LazyWithReceiverImpl<This, T> implements LazyWithReceiver<This, T> {
/*    */   @NotNull
/*    */   private final Function1<This, T> initializer;
/*    */   
/* 10 */   public LazyWithReceiverImpl(@NotNull Function1<This, T> initializer) { this.initializer = initializer;
/* 11 */     this.values = new WeakHashMap<>(); }
/*    */   @NotNull
/*    */   private final WeakHashMap<This, T> values; @NotNull
/* 14 */   public final Function1<This, T> getInitializer() { return this.initializer; } public T getValue(@NotNull Object thisRef, @NotNull KProperty property) { Intrinsics.checkNotNullParameter(thisRef, "thisRef"); Intrinsics.checkNotNullParameter(property, "property"); synchronized (this.values) { int $i$a$-synchronized-LazyWithReceiverImpl$getValue$1 = 0;
/*    */ 
/*    */       
/* 17 */       WeakHashMap<This, T> weakHashMap = this.values; Object key$iv = thisRef; int $i$f$getOrPut = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       Object value$iv = weakHashMap.get(key$iv);
/* 23 */       if (value$iv == null) {
/* 24 */         int $i$a$-getOrPut-LazyWithReceiverImpl$getValue$1$1 = 0; Object answer$iv = this.initializer.invoke(thisRef);
/* 25 */         weakHashMap.put((This)key$iv, (T)answer$iv);
/*    */       } 
/*    */       
/* 28 */       return (T)value$iv; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\LazyWithReceiverImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */