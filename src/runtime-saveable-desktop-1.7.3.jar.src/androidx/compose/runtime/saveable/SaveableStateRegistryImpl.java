/*     */ package androidx.compose.runtime.saveable;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\020 \n\002\020\000\n\000\n\002\030\002\n\002\020\013\n\000\n\002\020%\n\000\n\002\020!\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B7\022\034\020\002\032\030\022\004\022\0020\004\022\f\022\n\022\006\022\004\030\0010\0060\005\030\0010\003\022\022\020\007\032\016\022\004\022\0020\006\022\004\022\0020\t0\b¢\006\002\020\nJ\020\020\007\032\0020\t2\006\020\017\032\0020\006H\026J\022\020\020\032\004\030\0010\0062\006\020\021\032\0020\004H\026J\034\020\022\032\026\022\004\022\0020\004\022\f\022\n\022\006\022\004\030\0010\0060\0050\003H\026J \020\023\032\0020\0242\006\020\021\032\0020\0042\016\020\025\032\n\022\006\022\004\030\0010\0060\016H\026R\032\020\007\032\016\022\004\022\0020\006\022\004\022\0020\t0\bX\004¢\006\002\n\000R\"\020\002\032\026\022\004\022\0020\004\022\f\022\n\022\006\022\004\030\0010\0060\0050\013X\004¢\006\002\n\000R(\020\f\032\034\022\004\022\0020\004\022\022\022\020\022\f\022\n\022\006\022\004\030\0010\0060\0160\r0\013X\004¢\006\002\n\000¨\006\026"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "restored", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "valueProviders", "", "Lkotlin/Function0;", "value", "consumeRestored", "key", "performSave", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "runtime-saveable"})
/*     */ @SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1#2:172\n372#3,7:173\n215#4,2:180\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n131#1:173,7\n146#1:180,2\n*E\n"})
/*     */ final class SaveableStateRegistryImpl
/*     */   implements SaveableStateRegistry
/*     */ {
/*     */   @NotNull
/*     */   private final Function1<Object, Boolean> canBeSaved;
/*     */   @NotNull
/*     */   private final Map<String, List<Object>> restored;
/*     */   @NotNull
/*     */   private final Map<String, List<Function0<Object>>> valueProviders;
/*     */   
/*     */   public SaveableStateRegistryImpl(@Nullable Map restored, @NotNull Function1<Object, Boolean> canBeSaved) {
/* 107 */     this.canBeSaved = canBeSaved;
/*     */ 
/*     */ 
/*     */     
/* 111 */     if (restored == null || MapsKt.toMutableMap(restored) == null) MapsKt.toMutableMap(restored);  ((SaveableStateRegistryImpl)MapsKt.toMutableMap(restored)).restored = new LinkedHashMap<>();
/* 112 */     this.valueProviders = new LinkedHashMap<>();
/*     */   } public boolean canBeSaved(@NotNull Object value) {
/* 114 */     Intrinsics.checkNotNullParameter(value, "value"); return ((Boolean)this.canBeSaved.invoke(value)).booleanValue();
/*     */   } @Nullable
/*     */   public Object consumeRestored(@NotNull String key) {
/* 117 */     Intrinsics.checkNotNullParameter(key, "key"); List<Object> list = this.restored.remove(key);
/*     */     
/* 119 */     if (list.size() > 1) {
/* 120 */       this.restored.put(key, list.subList(1, list.size()));
/*     */     }
/* 122 */     return (list != null && (!list.isEmpty())) ? list.get(0) : 
/*     */       
/* 124 */       null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public SaveableStateRegistry.Entry registerProvider(@NotNull String key, @NotNull Function0<? extends Object> valueProvider) {
/* 129 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(valueProvider, "valueProvider"); if (!(!SaveableStateRegistryKt.access$fastIsBlank(key) ? 1 : 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 172 */       int $i$a$-require-SaveableStateRegistryImpl$registerProvider$1 = 0; String str = "Registered key is empty or blank"; throw new IllegalArgumentException(str.toString());
/* 173 */     }  Map<String, List<Function0<Object>>> $this$getOrPut$iv = this.valueProviders; int $i$f$getOrPut = 0; Object<Function0<Object>> value$iv = (Object<Function0<Object>>)$this$getOrPut$iv.get(key);
/* 174 */     if (value$iv == null) {
/* 175 */       int $i$a$-getOrPut-SaveableStateRegistryImpl$registerProvider$2 = 0; Object answer$iv = new ArrayList();
/* 176 */       $this$getOrPut$iv.put(key, answer$iv);
/*     */     } 
/*     */     
/* 179 */     ((List)value$iv).add(valueProvider); return new SaveableStateRegistryImpl$registerProvider$3(key, valueProvider); } @NotNull public Map<String, List<Object>> performSave() { Map<String, List<Object>> map = MapsKt.toMutableMap(this.restored); Map<String, List<Function0<Object>>> $this$forEach$iv = this.valueProviders; int $i$f$forEach = 0;
/* 180 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-SaveableStateRegistryImpl$performSave$1 = 0;
/*     */       String key = (String)entry1.getKey();
/*     */       List list = (List)entry1.getValue(); }
/*     */     
/*     */     return map; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/runtime/saveable/SaveableStateRegistryImpl$registerProvider$3", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "unregister", "", "runtime-saveable"})
/*     */   public static final class SaveableStateRegistryImpl$registerProvider$3 implements SaveableStateRegistry.Entry {
/*     */     SaveableStateRegistryImpl$registerProvider$3(String $key, Function0<Object> $valueProvider) {}
/*     */     
/*     */     public void unregister() {
/*     */       List list = (List)SaveableStateRegistryImpl.this.valueProviders.remove(this.$key);
/*     */       if (list != null) {
/*     */         list.remove(this.$valueProvider);
/*     */       } else {
/*     */       
/*     */       } 
/*     */       if (list != null && (!list.isEmpty()))
/*     */         SaveableStateRegistryImpl.this.valueProviders.put(this.$key, list); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableStateRegistryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */