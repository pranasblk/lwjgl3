/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

val CFTypeRef = PointerType("CFTypeRef", includesPointer = true)
val CFAllocatorRef = PointerType("CFAllocatorRef", includesPointer = true)

val CFStringEncoding = PrimitiveType("CFStringEncoding", UInt32)
val CFStringRef = PointerType("CFStringRef", includesPointer = true)

val CFBundleRef = PointerType("CFBundleRef", includesPointer = true)

val CFURLPathStyle = PrimitiveType("CFURLPathStyle", CFIndex)
val CFURLRef = PointerType("CFURLRef", includesPointer = true)